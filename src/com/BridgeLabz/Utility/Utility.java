package com.BridgeLabz.Utility;

public class Utility {
	// board case
	public static void boardCase() {

		char mat[] = new char[10];
		for (int i = 1; i < 10; i++) {
			mat[i] = ' ';
		}
	}
	// Play game to come
	public static void getTicTacGame(String user) {

		for (int i = 0; i < user.length(); i++) {
			char ch = user.charAt(i);
			if (ch == 'X' || ch == 'O' || ch == 'x' || ch == 'o')  {
			
			System.out.println("Choice your charctere: " +ch);
	
			char cumputer = (ch == 'X') ? 'O' : 'X';
            
		}
		else
		{
			System.out.println("Wrong choice: ");
		}
	}
  }
}