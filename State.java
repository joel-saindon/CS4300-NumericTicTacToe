import java.util.ArrayList;

public class State {
	private Board gameBoard;
	//private ArrayList<Integer> playerOne = new ArrayList<Integer>();
	//private ArrayList<Integer> playerTwo = new ArrayList<Integer>();
	private boolean isGoalState = false;
	
	public State() {
		System.out.println();
		gameBoard.printBoard();
		this.gameBoard = gameBoard;
	}

	public Board getGameBoard() {
		return gameBoard;
	}

	public void setGameBoard(Board gameBoard) {
		this.gameBoard = gameBoard;
	}

	public boolean isGoalState() {
		return isGoalState;
	}

	public void setGoalState(boolean isGoalState) {
		this.isGoalState = isGoalState;
	}
	
	
}
