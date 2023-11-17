package com.practiceset1.reversesecond;

public class UserMainCode {
	public static String swapCharacter(String str) {
		String res = "";
		for (int i = 0; i < str.length() - 1; i++) {
			if ((i + 1) % 2 != 0) {
				res += str.charAt(i + 1);
				res += str.charAt(i);
			}
		}
		if (str.length() % 2 != 0) {
			res += str.charAt(str.length() - 1);
		}

		return res;
	}
}
