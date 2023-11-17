package com.practiceset1.checkcharacter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = scan.nextLine();
		
		if(UserMainCode.checkCharacters(str)==1) {
			System.out.println("String is valid");
		}else {
			System.out.println("String is invalid");
		}
	}

}
