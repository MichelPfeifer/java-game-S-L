package lesson7;

/**
 * Ladder - from the Snakes and Ladders game
 */

class Ladder
{
	private BoardSquare top;

	public Ladder(BoardSquare top, BoardSquare foot) {
		setTop(top);
		foot.addLadder(this);
	}
	
	private void setTop(BoardSquare top) {
		this.top = top;
	}
	
	private BoardSquare getTop() {
		return top;
	}
	
	void movePlayerPiece(PlayerPiece counter)
	{		
		System.out.println("Up the ladder to " + getTop().getPosition());
		counter.setCurrentPosition(getTop());
	}
}

