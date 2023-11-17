package com.practiceset1.checkcharacter;

public class UserMainCode {
	public static int checkCharacters(String str) {
		if (str.charAt(0) == str.charAt(str.length() - 1)) {
			return 1;
		} else
			return -1;
	}
}
