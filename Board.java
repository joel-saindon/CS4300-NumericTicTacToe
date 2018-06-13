import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Board {
	private int [][] gameBoard;
	private ArrayList<Integer> evenPlayerMoves = new ArrayList<Integer>();
	private ArrayList<Integer> oddPlayerMoves = new ArrayList<Integer>();
	private String humanPlayer = null;
	
	public Board() {
		this.gameBoard = new int[4][4];
		for(int i=1; i<=16; i++) {
			if((i%2) == 0)
				this.evenPlayerMoves.add(i);
			else
				this.oddPlayerMoves.add(i);
		}
		
	}
	//print current gameboard
	public void printBoard() {
		int row,col;
		for(row = 0; row < 4; row++) {
				for(col =0; col<4; col++) {
					System.out.print(this.gameBoard[row][col] + " " );
				}
				System.out.println();
		}
		System.out.println(evenPlayerMoves.toString());
		System.out.println(oddPlayerMoves.toString());
		
	}
	//check that value attempting to be played is/isn't in array of available moves
	public boolean isValidValue(int value, boolean player) {
		if(player) {//if it's even players turn
			if(evenPlayerMoves.contains(value)) {
				return true;
			}
		}//if it's not even players turn, it's odd players turn
		else if(oddPlayerMoves.contains(value)) {
				return true;
		}
		else// if neither array contains the value, it means it's already on the board, return false
			return false;
		return false; //should never get here
	}
	
	//check to see if last move created a win
	public boolean isWin(boolean player) {
		int col,row,sum;
		for(row = 0; row <4; row++) {//check horizontal totals for win
			sum = 0;
			for(col = 0; col <4; col ++) {
				sum += gameBoard[row][col];
			}
			if(sum == 34) {
				System.out.println("Win in Row " + (row +1) +"!");
				return true;
			}
		}
		//reset position values
		row =0;
		col =0;
		sum =0;
		for(col=0; col <4; col++) { // check verticals for win
			sum = 0;
			for(row =0; row < 4; row++) {
				sum += gameBoard[row][col];
			}
			if(sum ==34) {
				System.out.println("Win in Col " + (col+1) + "!");
				return true;
			}
		}
		return false;
	}
	
	//check to see if space on board is already taken up
	public boolean isValidMove(int move) {
		int x = 0;
		int y = 0;
		//get coordinate pair based on provided move from player
		switch (move) {
		 case 0:
			//System.out.println("0");
			x=0;
			y=0;
			break;
		 case 1:
			 //System.out.println("1");
			 x=0;
			 y=1;
			 break;
		 case 2:
			 //System.out.println("2");
			 x=0;
			 y=2;
			 break;
		 case 3:
			//System.out.println("3");
			 x=0;
			 y=3;
			 break;
		 case 4:
			 //System.out.println("4");
			 x=1;
			 y=0;
			 break;
		 case 5:
			 //System.out.println("5");
			 x=1;
			 y=1;
			 break;
		 case 6:
			 //System.out.println("6");
			 x=1;
			 y=2;
			 break;
		 case 7:
			 //System.out.println("7");
			 x=1;
			 y=3;
			 break;
		 case 8:
			 //System.out.println("8");
			 x=2;
			 y=0;
			 break;
		 case 9:
			 //System.out.println("9");
			 x=2;
			 y=1;
			 break;
		 case 10:
			 //System.out.println("10");
			 x=2;
			 y=2;
			 break;
		 case 11:
			 //System.out.println("11");
			 x=2;
			 y=3;
			 break;
		 case 12:
			 //System.out.println("12");
			 x=3;
			 y=0;
			 break;
		 case 13:
			 //System.out.println("13");
			 x=3;
			 y=1;
			 break;
		 case 14:
			 //System.out.println("14");
			 x=3;
			 y=2;
			 break;
		 case 15:
			 //System.out.println("15");
			 x=3;
			 y=3;
			 break;
		default:
			System.out.println("error");
			break;
		 }
		//verify coordinate is open
		if (gameBoard[x][y] != 0) {
				return false;
		}
		else return true;
	}
	
	//Place value on board
	public void makeMove(int move, int value, boolean player) {
		System.out.println("move: " + move + " value: " + value);
		int x = 0;
		int y = 0;
		switch (move) {
		 case 0:
			//System.out.println("0");
			x=0;
			y=0;
			break;
		 case 1:
			 //System.out.println("1");
			 x=0;
			 y=1;
			 break;
		 case 2:
			 //System.out.println("2");
			 x=0;
			 y=2;
			 break;
		 case 3:
			//System.out.println("3");
			 x=0;
			 y=3;
			 break;
		 case 4:
			 //System.out.println("4");
			 x=1;
			 y=0;
			 break;
		 case 5:
			 //System.out.println("5");
			 x=1;
			 y=1;
			 break;
		 case 6:
			 //System.out.println("6");
			 x=1;
			 y=2;
			 break;
		 case 7:
			 //System.out.println("7");
			 x=1;
			 y=3;
			 break;
		 case 8:
			 //System.out.println("8");
			 x=2;
			 y=0;
			 break;
		 case 9:
			 //System.out.println("9");
			 x=2;
			 y=1;
			 break;
		 case 10:
			 //System.out.println("10");
			 x=2;
			 y=2;
			 break;
		 case 11:
			 //System.out.println("11");
			 x=2;
			 y=3;
			 break;
		 case 12:
			 //System.out.println("12");
			 x=3;
			 y=0;
			 break;
		 case 13:
			 //System.out.println("13");
			 x=3;
			 y=1;
			 break;
		 case 14:
			 //System.out.println("14");
			 x=3;
			 y=2;
			 break;
		 case 15:
			 //System.out.println("15");
			 x=3;
			 y=3;
			 break;
		default:
			System.out.println("error");
			break;
		 }
		gameBoard[x][y] = value;
		if(player == true) {
			evenPlayerMoves.remove((Integer) value);
		}
		else if (player == false) {
			oddPlayerMoves.remove((Integer) value);
		}
		
	}
	
	public void playGame() {
		if((humanPlayer == null) || humanPlayer.isEmpty()) {
			String input;
			Scanner scan = new Scanner(System.in);
			do{ 
				System.out.println("Choose player. Input 1 for odds or 2 for evens");
				input = scan.nextLine();
			} while (!input.equals("1") && !input.equals("2"));
			humanPlayer = input;
			scan.close();
		}
		System.out.println(humanPlayer);
		
	}

	public int[][] getGameBoard() {
		return gameBoard;
	}

	public void setGameBoard(int[][] gameBoard) {
		this.gameBoard = gameBoard;
	}

	public ArrayList<Integer> getEvenPlayerMoves() {
		return evenPlayerMoves;
	}

	public void setEvenPlayerMoves(ArrayList<Integer> evenPlayerMoves) {
		this.evenPlayerMoves = evenPlayerMoves;
	}

	public ArrayList<Integer> getOddPlayerMoves() {
		return oddPlayerMoves;
	}

	public void setOddPlayerMoves(ArrayList<Integer> oddPlayerMoves) {
		this.oddPlayerMoves = oddPlayerMoves;
	}
	
}
