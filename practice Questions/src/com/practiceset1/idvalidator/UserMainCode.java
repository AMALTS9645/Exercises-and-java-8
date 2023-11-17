package com.practiceset1.idvalidator;

public class UserMainCode {
	public static String validateIDLocations(String str, String loc) {
		String[] s = str.split("-");
		String res = "";

		String lastNum = s[s.length - 1];
		int count = 0;
		for (int i = 0; i < lastNum.length(); i++) {
			Character.isDigit(lastNum.charAt(i));
			count++;
		}

		if (s[1].equalsIgnoreCase(loc.substring(0, 3)) && count == 4) {
			return res + "Valid Id";
		} else {
			return res + "Invalid Id";
		}
	}
}
