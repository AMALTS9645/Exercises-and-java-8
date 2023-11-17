package com.practiceset1.passwordcheck;

public class UserMainCode {
	public static int validatePassword(String str) {
		int count = 0;
		for (int i = 0; i <= 9; i++) {
			if (str.contains(String.valueOf(i))) {
				count++;
			}

		}
		if (count == 0) {
			return -1;
		}
		
		
		if (str.length() >= 6 && str.length() <= 20) {
			if (str.contains("@") || str.contains("#") || str.contains("$")) {
				return 1;
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}
}
