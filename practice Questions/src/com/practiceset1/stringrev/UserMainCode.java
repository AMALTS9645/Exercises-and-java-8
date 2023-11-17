package com.practiceset1.stringrev;

public class UserMainCode {
	public static int reverseNumber(int a) {
		int rev = 0;
		while (a != 0) {
			int r = a % 10;
			rev = rev * 10 + r;
			a = a / 10;
		}
		return rev;
	}
}
