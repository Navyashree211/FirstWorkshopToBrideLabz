package com.BridgeLabz.Workshop;

import java.util.Random;

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
	
	public void PlayCom(char []t)
	{
		System.out.println("Computer Term to play the game");
		Random rd = new Random();
		int r=rd.nextInt(t.length);
		System.out.println(r);
		
		if (t[r]==0)
		{
			t[r] = 'X';
		}
		else {
			System.out.println("Invalid Input");
		}
		
	}

}
