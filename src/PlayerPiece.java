package lesson7;

/**
 * PlayerPiece - from the Snakes and Ladders game (used in Group Assignment 7.1)
 */

class PlayerPiece
{
	private BoardSquare currentPosition;
	private String color;

	PlayerPiece(String color)
	{
		setColor(color);
	}
	
	private void setColor(String color)
	{
		this.color =  color;
	}

	String getColor() 
	{
		return color;
	}

	BoardSquare getCurrentPosition()
	{
		return currentPosition;
	}

	void moveTo(BoardSquare newPosition)
	{
		newPosition.movePlayerPiece(this);
	}
	
	void setCurrentPosition(BoardSquare newPosition)
	{
		currentPosition = newPosition;
	}
}
