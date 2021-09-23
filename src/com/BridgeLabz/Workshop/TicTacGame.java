package com.BridgeLabz.Workshop;

import com.BridgeLabz.Utility.Utility;

public class TicTacGame {
	static char mat[] = new char[10];

	public static void main(String[] args) {
		System.out.println("Tic-Tac game started");

		System.out.println("user :");
		String user = InputUtility.getString();
		Utility.getTicTacGame(user);

		Utility.boardCase(mat);
		Utility.showBoard(mat);
	}

}
