package com.practiceset1.passwordcheck;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter password");
		String pass = scan.nextLine();

		int res = UserMainCode.validatePassword(pass);
		if (res == 1)
			System.out.println("Valid password");
		else
			System.out.println("Invalid Password");
	}

}
