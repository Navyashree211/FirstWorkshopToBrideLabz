package com.BridgeLabz.Workshop;

import com.BridgeLabz.Utility.Utility;

public class TicTacGame {
	public static void main(String[] args) {
		System.out.println("Tic-Tac game started");
		
		String user = InputUtility.getString();
		System.out.println(user);
		
		Utility.getTicTacGame(user);

		Utility.boardCase();
	}

}
