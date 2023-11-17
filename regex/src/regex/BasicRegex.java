package regex;

import java.util.regex.Pattern;

public class BasicRegex {

	public static void main(String[] args) {

		String inputPattern = "[abc]{2,5}";
		String input;
		input = "abcca";
		boolean check;

		// any char from a-z
		inputPattern = "[a-zA-Z]+";
		input = "Javed";

		// any digit
		inputPattern = "[0-9]+";
		input = "892828";

		// any word [a-zA-Z0-9]
		inputPattern = "\\w+\\s+\\w";
		// inputPattern = "\\w+\\s{1}\\w"; -->word then space then another word
		input = "abc ";

		check = Pattern.matches(inputPattern, input);
		System.out.println(check);

		String passwordPattern = "[\\w*\\d+\\w*[@#$]+]{6,20}";
		String password = "abc@12@345";
		check = Pattern.matches(passwordPattern, password);
		System.out.println(check);
	}

}
