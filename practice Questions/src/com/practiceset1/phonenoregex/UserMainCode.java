package com.practiceset1.phonenoregex;


import java.util.regex.Pattern;

public class UserMainCode {
	public static boolean validatePhone(String str) {
		String inputPattern = "^[1-9][0-9]{9}$";
		boolean check = Pattern.matches(inputPattern, str);
		return check;
	}
}
