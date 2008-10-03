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
package org.cspoker.server.rmi.export;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.cspoker.common.api.lobby.context.ForwardingRemoteLobbyContext;
import org.cspoker.common.api.lobby.context.RemoteLobbyContext;
import org.cspoker.common.api.lobby.holdemtable.context.HoldemTableContext;
import org.cspoker.common.util.lazymap.Factory;
import org.cspoker.common.util.lazymap.LazyMap;

public class ExportingLobbyContext extends ForwardingRemoteLobbyContext {

	private LazyMap<Long, HoldemTableContext, RemoteException> wrappers = new LazyMap<Long, HoldemTableContext, RemoteException>();
	
	public ExportingLobbyContext(RemoteLobbyContext lobbyContext) throws RemoteException {
		super(lobbyContext);
	}
	
	@Override
	public HoldemTableContext getHoldemTableContext(final long tableId) throws RemoteException {
		return wrappers.getOrCreate(tableId, new Factory<HoldemTableContext, RemoteException>(){
			public HoldemTableContext create() throws RemoteException {
				return (HoldemTableContext)UnicastRemoteObject.exportObject(new ExportingHoldemTableContext(lobbyContext.getHoldemTableContext(tableId)),0);
			}
		});
	}

}
