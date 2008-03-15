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
package org.cspoker.common.events.gameevents;

import java.rmi.RemoteException;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.cspoker.common.eventlisteners.RemoteAllEventsListener;
import org.cspoker.common.player.ShowdownPlayer;

/**
 * A class to represent show hand events.
 * 
 * @author Kenzo
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ShowHandEvent extends GameEvent {

	private static final long serialVersionUID = -3412700183566852150L;

	private ShowdownPlayer player;

	public ShowHandEvent(ShowdownPlayer player) {
		this.player = player;
	}

	protected ShowHandEvent() {
		// no op
	}

	
	public String toString() {
		return player.toString();
	}

	public ShowdownPlayer getShowdownPlayer() {
		return player;
	}

	
	public void dispatch(RemoteAllEventsListener listener)
			throws RemoteException {
		listener.onShowHandEvent(this);
	}

}
