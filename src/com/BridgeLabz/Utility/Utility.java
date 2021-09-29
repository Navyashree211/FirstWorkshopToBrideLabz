package com.BridgeLabz.Utility;

public class Utility {
	// board case
	public static void boardCase(char[] mat) {

		// char mat[] = new char[10];
		for (int i = 1; i < 10; i++) {
			mat[i] = ' ';
		}
	}

	// Play game to come
	public static void getTicTacGame(char user) {
		char ch = user;
		if (ch == 'X' || ch == 'O' || ch == 'x' || ch == 'o') {

			System.out.println("Choice your charctere is : " + ch);

			char computer = (ch == 'X') ? 'O' : 'X'; // here we can use ternary operator
														// (condition ? expr1 : expr2)
		} // if the condition is true then execute expr1 and condition is false then
			// execute expr2..
		else {
			System.out.println("Wrong choice: ");
		}
	}

	// A player would like to see the board so
	// I can choose valid cell to make my move during my turn..
	// This method show board display the current board..
	public static void showBoard(char[] mat) {
		System.out.println("| " + mat[1] + "|" + mat[2] + "|" + mat[3] + " |");
		System.out.println("|-------|");
		System.out.println("| " + mat[4] + "|" + mat[5] + "|" + mat[6] + " |");
		System.out.println("|-------|");
		System.out.println("| " + mat[7] + "|" + mat[8] + "|" + mat[9] + " |");

	}

	// Ability for user to make a move to a desired location in the board.

	public static void UserInput(char user, int possion, char[] mat) {  
		System.out.println(possion);
		
		if (FreeSpace(mat, possion) && possion < 10 && possion > 0) {
			mat[possion] = user;
		}
	}
	// Ability to check for the free space before making the desired move

	public static boolean FreeSpace(char[] mat, int possion) {  
		if (mat[possion] == ' ') {
			return true;
		} else {  
			return false;
		}
	}
}
