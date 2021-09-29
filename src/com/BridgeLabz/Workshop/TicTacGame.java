package com.BridgeLabz.Workshop;

import com.BridgeLabz.Utility.Utility;

public class TicTacGame {
	static char mat[] = new char[10];

	public static void main(String[] args) {
		System.out.println("Tic-Tac game started");
		System.out.println("Enter your choice X or O : ");

		System.out.println("user :");

		char user = InputUtility.getChar();
		Utility.getTicTacGame(user);

		Utility.boardCase(mat);
		System.out.println("Enter your Possion a number between [1 - 9] :  ");
		int possion = InputUtility.getIntValue();
		Utility.UserInput(user, possion, mat);

		Utility.showBoard(mat);
		Utility.FreeSpace(mat,possion);

	}

}
