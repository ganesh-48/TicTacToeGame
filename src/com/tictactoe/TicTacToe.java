package com.tictactoe;

public class TicTacToe {
	char[] board = new char[10];

	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe Game");

		char[] board = new char[10];

		createBoard(board, 10);
		printBoard(board);
	}

	public static void createBoard(char[] board, int size) {
		board[0] = 'D';
		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';
		}
	}

	public static void printBoard(char[] board) {
		for (int i = 1; i < board.length; i++) {
			System.out.print("values " + board[i] + " ");
			if (i % 3 == 0)
				System.out.println("\n");
		}
	}
}
