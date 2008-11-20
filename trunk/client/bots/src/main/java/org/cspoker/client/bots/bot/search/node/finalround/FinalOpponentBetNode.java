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
package org.cspoker.client.bots.bot.search.node.finalround;

import org.apache.log4j.Logger;
import org.cspoker.client.bots.bot.search.node.ActionNode;
import org.cspoker.client.bots.bot.search.node.OpponentBetNode;
import org.cspoker.client.common.gamestate.GameState;
import org.cspoker.client.common.gamestate.PlayerState;
import org.cspoker.common.elements.player.PlayerId;

public class FinalOpponentBetNode extends OpponentBetNode{
	
	private final static Logger logger = Logger.getLogger(FinalOpponentBetNode.class);
	
	public FinalOpponentBetNode(PlayerId botId, PlayerId opponentId, GameState gameState, int depth) {
		super(botId,opponentId,gameState, depth);
	}

	protected double doNextPlayer(GameState newGameState, PlayerState nextToAct) {
		ActionNode nextNode;
		if(nextToAct.getPlayerId().equals(botId)){
			nextNode = new FinalBotBetNode(botId,newGameState,depth+1);
		}else{
			nextNode = new FinalOpponentBetNode(botId, nextToAct.getPlayerId(),newGameState,depth+1);
		}
		nextNode.expand();
		return nextNode.getEV();
	}

	protected double doRoundEnd(GameState newGameState) {
		//round is over
		ShowdownNode showdownNode = new ShowdownNode(botId, newGameState,depth+1);
		showdownNode.expand();
		return showdownNode.getEV();
	}
	
}