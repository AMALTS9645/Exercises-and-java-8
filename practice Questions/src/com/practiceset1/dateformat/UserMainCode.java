package com.practiceset1.dateformat;

public class UserMainCode {
	public static int validateDate(String str) {
		String s[] = str.split("/");

		if (s[0].length() == 2 && s[1].length() == 2 && s[2].length() == 4) {
			return 1;
		} else
			return -1;
	}
}
