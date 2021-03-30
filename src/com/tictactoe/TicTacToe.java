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

	public static void showBoard() {
		/* printing the board */
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
		System.out.println("choose from X and O ");
		String x = sc.next();
		char player = x.charAt(0);
		char computer;
		if (player != 'X' && player != 'O') {
			System.out.println(" enter symbol");
		}
		if (player == 'X')
			computer = 'O';
		else
			computer = 'X';
		{
			if (turn == 0) {
				System.out.println("enter where you want to enter symbol ");
				index = sc.nextInt();
				board[index] = player;
				turn = 1;
			} else {
				int done = 0;
				while (done != 1) {
					Random rand = new Random();
					index = rand.nextInt(9) + 1;
					if (index == '&') {
						board[index] = computer;
						done = 1;
						turn = 0;
						break;
					} else
						continue;
				}

			}
		}
	}
}
