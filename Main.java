/***
 * Joel Saindon
 * CS4300 Proj2
 * Numeric Tic-Tac-Toe
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Implement algorithm
		// TODO Create State Space
		// TODO Implement two PC Player instances
		
		//Create new gameboard
		Board gameboard = new Board();
		gameboard.printBoard();
		//gameboard.playGame();
		boolean initPlayerType = false;
		ComputerPlayer PCPlayer1 = new ComputerPlayer(initPlayerType);
		PCPlayer1.generateMove(gameboard);
		int PCPlayerMove = PCPlayer1.getMoveSelection();
		int PCPlayerIndex = PCPlayer1.getPosIndex();
		
		//System.out.println(PCPlayerMove + "     " + PCPlayerIndex);
		
		gameboard.makeMove(PCPlayerIndex, PCPlayerMove, PCPlayer1.isPlayerType());
		gameboard.printBoard();
		
		int move, value;
		boolean moveCheck = true;
		boolean valueCheck = true;
		boolean player = false; //false indicates it is odd players turn
		
		Scanner scan = new Scanner(System.in);
		
		for(int i =1; i<=15; i++) {
			
			//print whose turn it is
			if(player == false)
				System.out.println("It is odd players turn");
			if(player == true)
				System.out.println("it is even players turn");
			System.out.println("Enter position to make move 0-15");
			move = scan.nextInt();
			moveCheck = gameboard.isValidMove(move);
			if (moveCheck == false) {
				System.out.println("invalid move");
				continue;
			}
			//have player enter value wanting to place on board
			System.out.println("Enter value desired: ");
			value = scan.nextInt();
			
			//check that value hasn't already been played
			valueCheck = gameboard.isValidValue(value, player);
			//System.out.println(valueCheck);
			if(valueCheck == false) {
				System.out.println("invalid value");
				continue;
			}
			
			//add move to the board and remove from remaining moves array
			gameboard.makeMove(move, value, player);
			if(gameboard.isWin(player))
				System.exit(0);
			gameboard.printBoard();
			if(player == true) { //ie, it's even players turn
				player = false;
				continue;
			}
			else if (player == false) {//ie, it's odds turn
				player = true;
				continue;
			}
			
		}
		
		scan.close();
	}

}
