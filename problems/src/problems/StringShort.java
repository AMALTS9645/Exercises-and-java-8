package problems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringShort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		
		String[] str = s.split(" ");
		
		String shortString = "";

		for(String st: str) {
			shortString+=st.charAt(0)+".";
			
		}
		System.out.println(shortString);

	}

}
