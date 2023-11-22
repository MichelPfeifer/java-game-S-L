package lesson7;

public class SnakesAndLadders 
{
	// reference to the GameBoard
	private GameBoard board;
	
	// the constructor creates the Board
	public SnakesAndLadders() 
	{
		board = new GameBoard(); 
	}
	
	// this method acts as a controller for playing the game 
	public void play()
	{
		PlayerPiece counter = new PlayerPiece("Red");
		counter.setCurrentPosition(board.getStartSquare());
		// iterate until we reach the end (square 100)
		while(counter.getCurrentPosition().getPosition()
				< GameBoard.MAX_SQUARES) 
		{
			board.movePlayerPiece(counter);
		}
		System.out.println(counter.getColor() + " counter finished on " +
				counter.getCurrentPosition().getPosition()); 
	}
	
	// 'main' creates a 'SnakesAndLadders' object and starts the game
	public static void main(String[] args) 
	{
		SnakesAndLadders myGame = new SnakesAndLadders();
		myGame.play(); 
	}
}
