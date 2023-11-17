package com.practiceset1.question1;

public class UserMainCode {

	public static int checkSum(int a) {
		int sum = 0;
		while (a != 0) {
			int r = a % 10; //84282 - 8 r=8; 
			if (r % 2 != 0) {
				sum = sum + r;
			}
			a = a / 10;
		}

		if (sum % 2 != 0) {
			return 1;
		} else
			return -1;
	}
}
