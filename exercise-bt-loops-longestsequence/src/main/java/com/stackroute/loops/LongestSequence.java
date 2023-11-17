package com.stackroute.loops;

import java.util.Scanner;

public class LongestSequence {
	public static void main(String[] args) {
		new LongestSequence().inputAcceptor();
	}

	// write logic to get inputs from user and send inputs to inputValidator
	public void inputAcceptor() {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		inputValidator(num);

	}

	// write logic to get inputs from user and send inputs to findLongestSequence
	public void inputValidator(int number) {

		if (number != 0) {
			if (number > 0) {
				System.out.println(findLongestSequence(number));
			} else {
				System.out.println("Give proper input not negative number");

			}
		} else {
			System.out.println("Give proper input not zero");
		}
	}

	// write logic to longest sequence of zeros in binary representation of given
	// number , returns result
	public int findLongestSequence(int number) {
		String str = "";
		while (number != 0) {
			int rem = number % 2;
			str += rem;
			number = number / 2;
		}
		String binary = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			binary += str.charAt(i);
		}

		int len = 0;
		int temp = 0;

		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '0') {
				len += 1;
			} else {
				if (len > temp) {
					temp = len;
				}
				len = 0;
			}

		}
		if (temp > len) {
			return temp;
		} else
			return len;
	}

	// write logic to print the given printStatement
	public void outputPrinter(Object printStatement) {
		System.out.println(printStatement);
	}
}
