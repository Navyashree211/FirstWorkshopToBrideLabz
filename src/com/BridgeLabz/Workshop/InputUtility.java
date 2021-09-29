package com.BridgeLabz.Workshop;

import java.util.Scanner;

public class InputUtility {

	static Scanner sc = new Scanner(System.in);

	public static String getString() {
		return sc.nextLine();
	}
	public static int getIntValue()  {
		return sc.nextInt();
	}
	public static char getChar() {
		
		return sc.next().charAt(0);
	}
	public static boolean getBoolean()
	{
		return sc.nextBoolean();
	}
}
