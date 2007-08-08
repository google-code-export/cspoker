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
package game.playerCommunication;

import game.TableId;
import game.events.GameEvent;
import game.gameControl.actions.IllegalActionException;

import java.util.List;

/**
 * An abstract class to represent player communication states.
 *
 * This class is only package-accessible.
 *
 * @author Kenzo
 *
 */
abstract class PlayerCommunicationState implements PlayerCommunication{

	/**
	 * The variable containing the player communication.
	 */
	protected final PlayerCommunicationImpl playerCommunication;

	/**********************************************************
	 * Constructor
	 **********************************************************/

	public PlayerCommunicationState(PlayerCommunicationImpl playerCommunication){
		this.playerCommunication = playerCommunication;
	}

	/**********************************************************
	 * Player Actions
	 **********************************************************/

	@Override
	public void bet(int amount) throws IllegalActionException {
		throw new IllegalActionException("Bet is not a valid action. "+getStdErrorMessage());
	}

	@Override
	public void raise(int amount) throws IllegalActionException {
		throw new IllegalActionException("Raise is not a valid action. "+getStdErrorMessage());
	}

	@Override
	public void call() throws IllegalActionException {
		throw new IllegalActionException("Call is not a valid action. "+getStdErrorMessage());
	}

	@Override
	public void check() throws IllegalActionException {
		throw new IllegalActionException("Check is not a valid action. "+getStdErrorMessage());
	}

	@Override
	public void deal() throws IllegalActionException {
		throw new IllegalActionException("Deal is not a valid action. "+getStdErrorMessage());

	}

	@Override
	public void fold() throws IllegalActionException {
		throw new IllegalActionException("Fold is not a valid action. "+getStdErrorMessage());
	}

	@Override
	public void allIn() throws IllegalActionException {
		throw new IllegalActionException("Going all-in is not a valid action. "+getStdErrorMessage());

	}

	/**********************************************************
	 * Leave/Join Game
	 **********************************************************/

	/**
	 * Join the table with given table id.
	 *
	 * @pre 	The given id should be effective.
	 *			|id!=null
	 * @throws  IllegalActionException [must]
	 *          This actions is not a valid action in the current state.
	 */
	@Override
	public void join(TableId id) throws IllegalActionException {
		throw new IllegalActionException();
	}

	@Override
	public void leaveTable() throws IllegalActionException {
		throw new IllegalActionException();
	}


	/**********************************************************
	 * Create/Start Game
	 **********************************************************/

	@Override
	public TableId createTable() throws IllegalActionException {
		throw new IllegalActionException();
	}

	@Override
	public void startGame() throws IllegalActionException {
		throw new IllegalActionException();
	}

	/**********************************************************
	 * Actions list
	 **********************************************************/

	@Override
	public List<GameEvent> getLatestGameEvents() throws IllegalActionException {
		throw new IllegalActionException();
	}

	@Override
	public List<GameEvent> getLatestGameEventsAndAck(long ack) throws IllegalActionException {
		throw new IllegalActionException();
	}

	protected abstract String getStdErrorMessage();

}