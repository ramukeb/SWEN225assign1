package game;

import java.util.HashSet;

import cards.Card;

public class Player {

	/**
	 * The names of the characters in the game. Their order also serves as the turn order.
	 * @author Michael
	 */

	public static enum Character{LUCILLA, BERT, MALINA, PERCY}
	private HashSet<Card> hand;	
	private boolean isComp;
	private Character character;

	
	//The Player's location on the board, as x and y coordinates.
	int locX;
	int LocY;
	String name;

    public Player(String name, int locX, int locY){
    	this.name = name;
    	this.locX = locX;
    	this.LocY = locY;
	}

	public Character getCharacter() {
		return character;
	}

	public String getName() {
		return name;
	}

	public int getLocX() {
		return locX;
	}

	public int getLocY() {
		return LocY;
	}

	public void setLocation(int x, int y){
		locX = x;
		locY = y;
	}

	/**
	 * Using this is inefficient - Cards know which player holds them.
	 * @param c
	 * @return True if the player has the specified Card; false otherwise.
	 */
	public boolean hasCard(Card c) {
		return hand.contains(c);
	}
	
	/**
	 * @param c
	 * @return True if this Player is the specified Character; false otherwise.
	 */
	public boolean isCharacter(Character c) {
		return this.character == c ? true : false;
	}
	
}
