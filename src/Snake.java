package lesson7;

/**
 * Snake - from the Snakes and Ladders game
 */

class Snake
{
	private BoardSquare tail;

	Snake(BoardSquare head, BoardSquare tail)
	{
		setTail(tail);
		head.addSnake(this);
	}

	private void setTail(BoardSquare tail)
	{
		this.tail = tail;
	}

	private BoardSquare getTail()
	{
		return tail;
	}
	
	void movePlayerPiece(PlayerPiece counter)
	{
		System.out.println("Down the snake to " + getTail().getPosition());
		counter.setCurrentPosition(getTail());
	}
}
