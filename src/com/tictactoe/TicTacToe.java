package com.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	public static char[] board = new char[10];

	static char player;

	static char computer;

	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe Game");

		createBoard();
		chooseSymbol();
		playGame();
		showBoard();

	}

	public static void createBoard() {
		board[0] = 'S';
		for (int i = 1; i < board.length; i++) {
			board[i] = '&';
		}
	}

	public static void chooseSymbol() {
		Scanner sc = new Scanner(System.in);
		System.out.println("choose from X and O");
		String x = sc.next();
		player = x.charAt(0);
		if (player != 'X' && player != 'O') {
			System.out.println(" enter correct symbol");
		}
		if (player == 'X')
			computer = 'O';
		else
			computer = 'X';

	}
	
	
	public static int chooseDesiredLoaction() {
		// showBoard();
		Scanner sc = new Scanner(System.in);
		int index;
		System.out.println("enter your input ");
		index = sc.nextInt();
		if (board[index] == '$') {
			System.out.println("your valid  move and its done");
			return index;
		} else
			System.out.println("please choose a empty location");
		return -1;
	}


	public static void showBoard() {
		// printing a board
		for (int i = 1; i < board.length; i++) {
			System.out.print(board[i] + " ");
			if (i % 3 == 0)
				System.out.println(" ");
		}
	}

	public static void playGame() {
		int turn = 0;
		int winner = 0;
		int index = 1;
		Scanner sc = new Scanner(System.in);
		{
		showBoard();
		System.out.println(" ");
		if (turn == 0) {
			System.out.println(" enter symbol");
			index = chooseDesiredLoaction();
			if (!(index == -1))
				board[index] = player;
				System.out.println("Your move done");
				turn = 1;
		}
		 else {
			 System.out.println("Compuer turn");
				index = chooseDesiredLoaction();
					if (!(index == -1)) {
						board[index] = computer;
						System.out.println("Compuer turn over");
						turn = 0;
					}
				}
		}
	}
}
			
		
	

