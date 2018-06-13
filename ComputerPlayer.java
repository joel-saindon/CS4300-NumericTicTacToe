import java.util.Random;

public class ComputerPlayer {
	private int posIndex;//position on board to play at - random
	private int moveSelection;//index of number to play - random
	private boolean playerType; //true for odd player
	
	public ComputerPlayer(boolean playerType) {
		this.posIndex = 0;
		this.moveSelection = 0;
		this.playerType = playerType;
	}
	
	//generate move for computer player to play
	public void generateMove(Board gameBoard) {
		//generate index to pick from within moves still available array
		int maxSize = 0;
		Random rand = new Random();
		if (this.playerType == false) {//if player is odd player
			maxSize = gameBoard.getOddPlayerMoves().size();
			this.moveSelection = rand.nextInt((maxSize - 0) + 1)+ 0;
			//System.out.println(this.moveSelection);
		}
		else if(this.playerType == true) {
			maxSize = gameBoard.getEvenPlayerMoves().size();
			this.moveSelection = rand.nextInt((maxSize - 0) + 1)+ 0;
			//System.out.println(this.moveSelection);
		}
		
		//generate and check position on gameboard to attempt to play at
		Random randMove = new Random();
		this.posIndex = randMove.nextInt((16-0) +1) +0;
		while(gameBoard.isValidMove(this.posIndex) == false) {//check if randomly generated move is valid until a valid one is produced
			this.posIndex = randMove.nextInt((16-0)+1)+0;
			//System.out.println(this.posIndex);
		}
		
	}

	public int getPosIndex() {
		return posIndex;
	}

	public void setPosIndex(int posIndex) {
		this.posIndex = posIndex;
	}

	public int getMoveSelection() {
		return moveSelection;
	}

	public void setMoveSelection(int moveSelection) {
		this.moveSelection = moveSelection;
	}

	public boolean isPlayerType() {
		return playerType;
	}

	public void setPlayerType(boolean playerType) {
		this.playerType = playerType;
	}
}
