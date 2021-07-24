package board;

import game.*;

public class Square {
	
	public static enum Room{HAUNTED_HOUSE, MANIC_MANOR, PERIL_PALACE, CALAMITY_CASTLE, VILLA_CELIA}
	
	private Room room;
	private boolean isRoom = false;
	private Player player;
	
	//Accessibility fields - can you move this direction from this square?
	private boolean up = true;
	private boolean down = true;
	private boolean left = true;
	private boolean right = true;
	
	public Square() {
		
	}
	
	public void setUp(boolean val) { up = val; }
	public void setDown(boolean val) { down = val; }
	public void setLeft(boolean val) { left = val; }
	public void setRight(boolean val) { right = val; }
	public boolean getUp() { return up; }
	public boolean getDown() { return down; }
	public boolean getLeft() { return left; }
	public boolean getRight() { return right; }
	public void setPlayer(Player p) { player = p; }
	public Player getPlayer() { return player; }
	public void setIsRoom() { isRoom = true; }
	public boolean getIsRoom() { return isRoom; }
	public void setRoom(Room room) { this.room = room; }
	public Room getRoom() { return room; }
	

}
