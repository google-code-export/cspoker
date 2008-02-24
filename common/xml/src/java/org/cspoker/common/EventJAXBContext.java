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
package org.cspoker.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.apache.log4j.Logger;
import org.cspoker.common.events.gameevents.GameMessageEvent;
import org.cspoker.common.events.gameevents.NewCommunityCardsEvent;
import org.cspoker.common.events.gameevents.NewDealEvent;
import org.cspoker.common.events.gameevents.NewRoundEvent;
import org.cspoker.common.events.gameevents.NextPlayerEvent;
import org.cspoker.common.events.gameevents.PlayerJoinedGameEvent;
import org.cspoker.common.events.gameevents.PlayerLeftTableEvent;
import org.cspoker.common.events.gameevents.ShowHandEvent;
import org.cspoker.common.events.gameevents.WinnerEvent;
import org.cspoker.common.events.gameevents.playeractionevents.AllInEvent;
import org.cspoker.common.events.gameevents.playeractionevents.BetEvent;
import org.cspoker.common.events.gameevents.playeractionevents.BigBlindEvent;
import org.cspoker.common.events.gameevents.playeractionevents.CallEvent;
import org.cspoker.common.events.gameevents.playeractionevents.CheckEvent;
import org.cspoker.common.events.gameevents.playeractionevents.FoldEvent;
import org.cspoker.common.events.gameevents.playeractionevents.RaiseEvent;
import org.cspoker.common.events.gameevents.playeractionevents.SmallBlindEvent;
import org.cspoker.common.events.gameevents.privateevents.NewPocketCardsEvent;
import org.cspoker.common.events.serverevents.PlayerJoinedEvent;
import org.cspoker.common.events.serverevents.PlayerLeftEvent;
import org.cspoker.common.events.serverevents.ServerMessageEvent;
import org.cspoker.common.events.serverevents.TableCreatedEvent;
import org.cspoker.common.xml.actions.ActionJAXBContext;
import org.cspoker.common.xml.events.invokation.IllegalActionEvent;
import org.cspoker.common.xml.events.invokation.SuccessfulInvokationEvent;

public class EventJAXBContext {

	private final static Logger logger = Logger.getLogger(EventJAXBContext.class);

	public final static JAXBContext context = initContext();

    private static JAXBContext initContext() {
        try {
			return JAXBContext.newInstance(getActions());
		} catch (JAXBException e) {
			logger.fatal(e);
			throw new IllegalStateException(e);
		}
    }
	
    public static Class[] getActions(){
    	return new Class[]{
    			//playeractionevents
				AllInEvent.class, BetEvent.class, BigBlindEvent.class,
				CallEvent.class, CheckEvent.class, FoldEvent.class, RaiseEvent.class, SmallBlindEvent.class,
				//privatevents
				NewPocketCardsEvent.class,
				//gameevents
				GameMessageEvent.class, NewCommunityCardsEvent.class, NewDealEvent.class, NewRoundEvent.class, 
				NextPlayerEvent.class, PlayerJoinedGameEvent.class, PlayerLeftTableEvent.class, 
				ShowHandEvent.class, WinnerEvent.class,
				//invokation
				SuccessfulInvokationEvent.class, IllegalActionEvent.class,
				//serverevents
				PlayerJoinedEvent.class, PlayerLeftEvent.class, ServerMessageEvent.class, TableCreatedEvent.class
				};
    }
}
