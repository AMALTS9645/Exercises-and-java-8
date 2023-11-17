package regexproblems;

import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {

		String regex = "[a-zA-Z]{3,}@[a-zA-Z]{5}(\\.com)";

		check(regex, "test@gmail.com");
		check(regex, "test@g.com");
		check(regex, "test@gmail.in");
		check(regex, "amal@yahoo.com");

	}

	public static void check(String regex, String mail) {
		System.out.println("For " + mail + " matches " + Pattern.matches(regex, mail));
	}

}
