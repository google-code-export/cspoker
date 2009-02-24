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
package org.cspoker.common.handeval.spears;

public class Card {
	public static final int count = 52;
	private static Card[] values = new Card[count];
	public final Rank rank;
	public final Suit suit;
  //public int rank;
  //public int suit;
  int ordinal;
	final String toString;
	final String name;
	
	public int ordinal() {
		return ordinal;
	}
	
	public String toString() {	/* As */
		return toString;
	}
	
	public String name() { /* AceOfSpades */
		return name;
	}
	
	public static Card get(Rank rank, Suit suit) {
		return Card.values()[ordinal(rank, suit)];
	}

  public static Card get(int ord) {
    return values[ord];
  }
  

  public static Card[] values() {
		return values;
	} 

	public static String toString(Card[] hand) {
		if(hand == null) return "NULL";
		if(hand.length == 0)return "NULL";
		StringBuffer b = new StringBuffer();
		for (Card card : hand) {
			b.append(card.toString);
		}
		return b.toString();
	}


    public static Card parse(String s) {
    	Rank rank = Rank.parse(s.substring(0, 1));
    	Suit suit = Suit.parse(s.substring(1, 2));

    	return Card.get(rank, suit);
    }
    
	
	static {
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				Card c = new Card(rank, suit);
				int ordinal = c.ordinal;
				values[ordinal] = c;
			}
		}
	}

	private Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
		this.ordinal = ordinal(rank, suit);
		this.name = rank.name() + "Of" + suit.name();
		this.toString = rank.toString() + suit.toString();
	}


  private static int ordinal(Rank rank, Suit suit) {
		return rank.ordinal() + suit.ordinal() * 13;
	}

  public static Card[] parseArray(String s) {
		int noCards = s.length()/2;
		Card[] result = new Card[noCards];
		for (int i = 0; i < noCards; i++) {
			result[i] = Card.parse( s.substring(2*i, 2*i+2));
		}
		return result;
	}



}


