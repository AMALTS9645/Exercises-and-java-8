package com.practiceset1.reversesecond;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = scan.nextLine();

		String result = UserMainCode.swapCharacter(str);

		System.out.println("Reverse of second element string is : " + result);
	}

}
