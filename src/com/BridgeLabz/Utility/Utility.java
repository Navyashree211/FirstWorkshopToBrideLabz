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
		//System.out.println(">"+user);
		//for (int i = 0; i < user.length(); i++) {
			
			char ch = user;
			//System.out.println("> >"+ch);
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

	public static void UserInput(char user, int possion, char [] mat) {
		System.out.println(possion);
		mat[possion] = user;
		//System.out.println(mat[possion]);
		
	}
}
//		switch (possion) {
//		case 1:
//			mat[possion] = 'X';
//			break;
//		case 2:
//			mat[possion] = 'X';
//			break;
//		case 3:
//			mat[possion] = 'X';
//			break;
//		case 4:
//			mat[possion] = 'X';
//			break;
//		case 5:
//			mat[possion] = 'X';
//			break;
//		case 6:
//			mat[possion] = 'X';
//			break;
//		case 7:
//			mat[possion] = 'X';
//			break;
//		case 8:
//			mat[possion] = 'X';
//			break;
//		case 9:
//			mat[possion] = 'X';
//			break;
//		}
//		
//	}
//}