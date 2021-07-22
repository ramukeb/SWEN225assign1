package board;

import game.*;

public class Square {
	
	public static enum Room{HAUNTED_HOUSE, MANIC_MANOR, PERIL_PALACE, CALAMITY_CASTLE, VILLA_CELIA}
	
	private Room room;
	private boolean isRoom = false;
	private Player player;
	
	//Accessibility fields - can you move this direction from this square?
	private boolean up;
	private boolean down;
	private boolean left;
	private boolean right;
	
	public Square() {}
	
	

}
