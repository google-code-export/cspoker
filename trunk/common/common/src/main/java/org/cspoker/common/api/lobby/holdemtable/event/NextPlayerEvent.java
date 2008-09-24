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

package org.cspoker.common.api.lobby.holdemtable.event;

import javax.xml.bind.annotation.XmlRootElement;

import org.cspoker.common.elements.player.Player;

/**
 * A class to represent new player events.
 * 
 * @author Kenzo
 * 
 */
@XmlRootElement
public class NextPlayerEvent implements HoldemTableEvent {

	private static final long serialVersionUID = -2048233796443189725L;

	private Player player;

	public NextPlayerEvent(Player player) {
		this.player = player;
	}

	protected NextPlayerEvent() {
		// no op
	}

	public Player getPlayer() {
		return player;
	}

	public String toString() {
		return "It's " + player.getName() + "'s turn.";
	}
	
	public void dispatch(HoldemTableListener holdemTableListener) {
		holdemTableListener.onNextPlayer(this);
	}

}