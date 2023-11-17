package regexproblems;

import java.util.regex.Pattern;

public class PasswordValidate {

	public static void main(String[] args) {
		
//		minimum length is 8
//		should contain any of these @/_/#
//		should not start with number/special chars(@/#/_)
//		should not end with special chars
//		can contain numbers,letters,special chars
		
		String regex = "^[a-zA-Z][a-zA-Z0-9]+{5,}[@/_#][a-zA-Z0-9]+$";
		
		String pass1 = "amal123@amal";
		String pass2 = "amal123";
		String pass3 = "07amal";
		String pass4 = "amaltsph_0876";
		
		check(regex, pass1);
		check(regex, pass2);
		check(regex, pass3);
		check(regex, pass4);

		
	}
	public static void check(String regex, String str) { 
		System.out.println("For "+str+" matches "+Pattern.matches(regex, str));
	}

}
