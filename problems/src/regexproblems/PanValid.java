package regexproblems;

import java.util.regex.Pattern;

public class PanValid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "[A-Z]{3}[0-9]{4}[A-Z]";
		String pan1 = "CLD1234F";
		String pan2 = "CLDG234F";
		String pan3 = "ZLD5462D";
		String pan4 = "123ABC4F";
		
		
		check(regex, pan1);
		check(regex, pan2);
		check(regex, pan3);
		check(regex, pan4);
		

	}
	
	public static void check(String regex, String str) { 
		System.out.println("For "+str+" matches "+Pattern.matches(regex, str));
	}

}
