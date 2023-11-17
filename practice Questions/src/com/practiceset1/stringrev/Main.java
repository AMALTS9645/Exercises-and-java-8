package com.practiceset1.stringrev;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();

		int result = UserMainCode.reverseNumber(num);

		System.out.println("Reverse is :" + result);
	}

}
