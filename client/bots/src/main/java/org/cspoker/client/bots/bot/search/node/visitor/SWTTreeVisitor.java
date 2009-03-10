/**
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 */
package org.cspoker.client.bots.bot.search.node.visitor;

import java.util.LinkedList;
import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
import org.cspoker.client.bots.bot.search.action.ActionWrapper;
import org.cspoker.client.bots.bot.search.action.EvaluatedAction;
import org.cspoker.client.bots.bot.search.action.ProbabilityAction;
import org.cspoker.client.bots.bot.search.action.SampledAction;
import org.cspoker.client.bots.bot.search.node.ActionNode;
import org.cspoker.client.bots.bot.search.node.BotActionNode;
import org.cspoker.common.elements.table.Round;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ShellAdapter;
import org.eclipse.swt.events.ShellEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;

public class SWTTreeVisitor implements NodeVisitor{

	private final static Logger logger = Logger.getLogger(SWTTreeVisitor.class);
	private final Display display;
	private final Shell shell;
	private final Tree tree;

	public SWTTreeVisitor(Display display, Shell shell, final Tree tree) {
		this.display = display;
		this.shell = shell;
		this.tree = tree;
		display.syncExec(new Runnable(){
			public void run(){
				tree.removeAll();
			}
		});
	}

	private final LinkedList<TreeItem> items = new LinkedList<TreeItem>();

	@Override
	public void enterNode(final ActionNode node, final ActionWrapper action, final int tokens) {
		display.syncExec(new Runnable(){
			public void run(){
				TreeItem item = items.peek();
				TreeItem newItem;
				if(item==null){
					newItem = new TreeItem(tree, SWT.NONE);
				}else{
					newItem = new TreeItem(item, SWT.NONE);
				}
				ProbabilityAction probAction;
				String samples = "n/a";
				if(action instanceof SampledAction){
					SampledAction sampledAction = (SampledAction)action;
					probAction = sampledAction.getProbabilityAction();
					samples = sampledAction.getTimes()+"/"+sampledAction.getOutof();
				}else if(action instanceof ProbabilityAction){
					probAction = ((ProbabilityAction)action);
				}else{
					throw new IllegalStateException("What action is this? "+action);
				}
				String actor = (node instanceof BotActionNode) ? "Bot": "Player "+node.getPlayerId();
				newItem.setText(new String[] { 
						actor, 
						action.getAction().toString(), 
						node.getGameState().getRound().getName(),
						Math.round(100*probAction.getProbability())+"%" , 
						samples,
						"?", 
						"?", 
						""+tokens 
				});
				if(node.getGameState().getRound()==Round.FINAL){
					newItem.setBackground(2,new Color(display, 255,30,30));
				}else if(node.getGameState().getRound()==Round.TURN){
					newItem.setBackground(2,new Color(display, 255,100,100));;	
				}else if(node.getGameState().getRound()==Round.FLOP){
					newItem.setBackground(2,new Color(display, 255,170,170));
				}else if(node.getGameState().getRound()==Round.PREFLOP){
					newItem.setBackground(2,new Color(display, 255,240,240));
				}
				items.push(newItem);
			}
		});
	}



	@Override
	public void leaveNode(final EvaluatedAction<? extends ActionWrapper> evaluation) {
		display.syncExec(new Runnable(){
			@Override
			public void run() {
				try {
					TreeItem item = items.pop();
					item.setText(5, ""+Math.round(evaluation.getEV()));
					item.setText(6, ""+Math.round(Math.sqrt(evaluation.getVarEV())));
				} catch (NoSuchElementException e) {
					tree.redraw();
				}
			}
		});
	}

	public static class Factory implements NodeVisitor.Factory{

		private final Display display;
		private Shell shell;
		private Tree tree;

		public Factory(final Display display) {
			this.display = display;
			display.syncExec(new Runnable(){

				public void run(){
					shell = new Shell(display);
					shell.addShellListener(new ShellAdapter() {
						public void shellClosed(ShellEvent e) {
							e.doit = false;
						}
					});
					shell.setSize(600, 400);
					shell.setLayout(new FillLayout());
					shell.setText("Game Tree Browser");
					tree = new Tree(shell, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
					tree.setHeaderVisible(true);

					TreeColumn column = new TreeColumn(tree, SWT.LEFT);
					column.setText("Actor");
					column.setWidth(200);

					column = new TreeColumn(tree, SWT.CENTER);
					column.setText("Action");
					column.setWidth(100);
					
					column = new TreeColumn(tree, SWT.CENTER);
					column.setText("Round");
					column.setWidth(50);

					column = new TreeColumn(tree, SWT.CENTER);
					column.setText("P(Action)");
					column.setWidth(70);
					
					column = new TreeColumn(tree, SWT.CENTER);
					column.setText("Samples");
					column.setWidth(70);

					column = new TreeColumn(tree, SWT.CENTER);
					column.setText("E(V)");
					column.setWidth(80);

					column = new TreeColumn(tree, SWT.CENTER);
					column.setText("σ(V)");
					column.setWidth(80);

					column = new TreeColumn(tree, SWT.CENTER);
					column.setText("Tokens");
					column.setWidth(50);

					shell.pack();
					shell.open();
				}

			});
		}

		@Override
		public NodeVisitor create() {
			return new SWTTreeVisitor(display, shell, tree);
		}

	}

}

