package com.practiceset1.timeformat;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the time in 'hh:mm am/pm' format: ");
		String date = scan.nextLine();

		int result = UserMainCode.validateTime(date);
		if (result == 1) {
			System.out.println("Valid");
		} else
			System.out.println("Invalid");

	}

}
