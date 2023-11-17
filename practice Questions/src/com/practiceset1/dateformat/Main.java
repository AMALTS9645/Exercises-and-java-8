package com.practiceset1.dateformat;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the date in dd/mm/yyyy format: ");
		String date = scan.nextLine();

		int result = UserMainCode.validateDate(date);
		if (result == 1) {
			System.out.println("Valid");
		} else
			System.out.println("Invalid");
	}

}
