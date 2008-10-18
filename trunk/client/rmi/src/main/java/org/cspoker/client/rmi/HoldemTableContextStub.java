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
package org.cspoker.client.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.cspoker.common.api.lobby.holdemtable.context.ExternalRemoteHoldemTableContext;
import org.cspoker.common.api.lobby.holdemtable.context.ForwardingExternalRemoteHoldemTableContext;
import org.cspoker.common.api.lobby.holdemtable.holdemplayer.context.RemoteHoldemPlayerContext;
import org.cspoker.common.api.lobby.holdemtable.holdemplayer.listener.ForwardingRemoteHoldemPlayerListener;
import org.cspoker.common.api.lobby.holdemtable.holdemplayer.listener.HoldemPlayerListener;
import org.cspoker.common.api.lobby.holdemtable.holdemplayer.listener.RemoteHoldemPlayerListener;
import org.cspoker.common.api.shared.exception.IllegalActionException;

public class HoldemTableContextStub extends ForwardingExternalRemoteHoldemTableContext{

	public HoldemTableContextStub(ExternalRemoteHoldemTableContext context)
			throws RemoteException {
		super(context);
	}
	
	@Override
	public RemoteHoldemPlayerContext sitIn(long seatId, int buyIn,
			HoldemPlayerListener holdemPlayerListener) throws RemoteException, IllegalActionException {
		return super.sitIn(seatId, buyIn,(RemoteHoldemPlayerListener) UnicastRemoteObject.exportObject(
				new ForwardingRemoteHoldemPlayerListener(holdemPlayerListener), 0));
		
	}
}
