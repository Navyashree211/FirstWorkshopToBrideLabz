package com.BridgeLabz.Workshop;

public class TicTacGame {
	public static void main(String[] args) {
		System.out.println("Tic-Tac game started");
		boardCase();
	}

	public static void boardCase() {

		char mat[] = new char[10];
		for (int i = 1; i < 10; i++) {
			mat[i] = ' ';
		}
	}

}
