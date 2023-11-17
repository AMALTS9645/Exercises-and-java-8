package com.practiceset1.phonenoregex;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the phone number: ");
		String s = scan.nextLine();
		
		System.out.println(UserMainCode.validatePhone(s));

	}

}
