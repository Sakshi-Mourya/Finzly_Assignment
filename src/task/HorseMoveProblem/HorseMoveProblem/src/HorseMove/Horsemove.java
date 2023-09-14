package HorseMove;

import java.util.Scanner;

public class Horsemove {
	
	
	   public static void main(String[] args) {
		  
		  Scanner s = new Scanner(System.in);
		  int n = s.nextInt();
		  int row = s.nextInt();
		  int col = s.nextInt();
		  int[][] board = new int [n][n];
		 
		  printBoard(board);
		  horseTour(board, row, col,1);
		  printBoard(board);
	}
	   
	   
	  public static void printBoard(int[][] board) {
		
		  for(int i =0;i< board.length;i++) {
			  for(int j =0;j<board[0].length;j++) {
				  System.out.print(board[i][j]+ " ");
			  }
			  System.out.println();
			  
		  }
		  System.out.println();
	  }
	  
	  public static void  horseTour(int [][] board,int row, int col,int move) {
		  
		  if(row <0 ||col<0 ||row >= board.length|| col>=board.length || board[row][col]>0) {
			  return;
		  }else if(move == board.length*board.length) {		  
			  board[row][col] = move;
			  printBoard(board);
			  board[row][col] = 0;
			  return;
			  
		  }
		  
		  
		  board[row][col] = move;
		  horseTour(board, row-2, col+1, move+1);
		  horseTour(board, row-1, col+2, move+1);
		  horseTour(board, row+1, col+2, move+1);
		  horseTour(board, row+2, col+1, move+1);
		  horseTour(board, row+2, col-1, move+1);
		  horseTour(board, row+1, col-2, move+1);
		  horseTour(board, row-1, col-2, move+1);
		  horseTour(board, row-2, col-1, move+1);
		  board[row][col] = 0;
		  
		  
	  }
	}

