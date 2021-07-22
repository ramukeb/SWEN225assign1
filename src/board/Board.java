package board;

import game.*;

public class Board {
	
	public static enum Direction{UP, DOWN, LEFT, RIGHT}
	
	private Square[][] squares;
	
	public Board() {
		squares = new Square[24][24];
		makeBoard();
	}
	
	private void makeBoard() {
		//TODO: implement walls and rooms
	}

}
