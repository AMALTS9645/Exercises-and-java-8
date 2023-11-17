package com.practiceset1.question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();

		int result = UserMainCode.checkSum(num);

		if (result == 1) {
			System.out.println("Sum of odd digits is odd.");
		} else {
			System.out.println("Sum of odd digits is even.");
		}
	}

}
