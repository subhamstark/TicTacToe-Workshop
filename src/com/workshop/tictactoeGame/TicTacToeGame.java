package com.workshop.tictactoeGame;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeGame {
	
	//Class Variables
	private static final char ROUND='O';
	private static final char CROSS='X';
	private static final char BLANK=' ';
	private char[] board ;
	private static int boardSize=10;
	private char playerChar;
	private char opponentChar;
	private final Scanner scannerObj = new Scanner(System.in);
	
	
	//Class Functions
	private void board()
	{
		//instantiate char board with board_size
		board = new char[boardSize];
		Arrays.fill(board, BLANK);
	}
	private void player_choice_XO() {
		System.out.println("Please Choose X or O");
		
		//Take Input from user for Token (i.e X or O)
		playerChar=scannerObj.next().toUpperCase().charAt(0); 
		opponentChar = (playerChar == CROSS) ? ROUND : CROSS;
	}
	
	private void showPlayer() {
		//Showing the Token for Player and Opponent
		System.out.println("Player Token " + playerChar + " Opponent Token " + opponentChar);
	}
	
	private void showBoard() {
		//Printing the Current State of the Game Board
		System.out.println("\n**** Board ****");
		for(int i=1;i<boardSize;i=i+3) {
			System.out.println("  " + board[i] + " | " + board[i+1] + " | " + board[i+2]); 
		    System.out.println("-------------");
		}
	}
	private boolean choosePosition() {
		// Taking Choice of User to get the Current Position in Board
		
		System.out.println("Choose any Number Between 1 and 9 ");
		int currentPos=scannerObj.nextInt();
		boolean status = (board[currentPos]==BLANK) ? true : false;
		return status;
	}
	public static void main(String args[]) {
		System.out.println("Game");
		TicTacToeGame game1 = new TicTacToeGame();
		game1.board();
		
		game1.player_choice_XO();
		game1.showPlayer();
		game1.showBoard();
		System.out.print(game1.choosePosition());
	}
	
}
