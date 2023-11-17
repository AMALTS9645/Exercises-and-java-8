package com.practiceset1.timeformat;

public class UserMainCode {
	public static int validateTime(String str) {

		String s[] = null;
		if (!str.isEmpty() && !str.isBlank()) {
			s = str.split("[: ]");
		} else {
			System.out.println("Enter valid input");
		}

		if (s[2].trim().equalsIgnoreCase("am") || s[2].trim().equalsIgnoreCase("pm")) {
			if (Integer.parseInt(s[0]) <= 12 && Integer.parseInt(s[0]) > 0 && s[0].length() == 2) {
				if (Integer.parseInt(s[1]) <= 60 && Integer.parseInt(s[1]) > 0 && s[1].length() == 2) {
					return 1;
				} else
					return -1;

			} else
				return -1;
		} else
			return -1;

	}
}
