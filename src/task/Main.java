package task;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		TicTacToe game = new TicTacToe();
		game.fillBoard();
		
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			game.printBoard();
			System.out.println("Current Player : "+game.currentPlayer);
			System.out.println("Enter row and column (e.g, 0 1");
			
			int row = sc.nextInt();
			int col = sc.nextInt();
			
			if(game.validMove(row,col)) {
				if(game.checkWin()) {
					game.printBoard();
					
					System.out.println("Player "+(game.currentPlayer == 'X' ? 'O' : 'X')+"Wins!");
					break;
				}
				else if(game.isDraw()) {
					game.printBoard();
					System.out.println("It's a draw");
					break;
				}
			}
			else {
				System.out.println("Invalid move. Try again");
			}
		}
		
	}
}
