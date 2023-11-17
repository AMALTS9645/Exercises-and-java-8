package com.practiceset1.idvalidator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Id in UST-LLL-XXXX format : ");
		String str = scan.nextLine();
		System.out.println("Enter the location: ");
		String loc = scan.nextLine();

		String res = UserMainCode.validateIDLocations(str, loc);
		System.out.println(res);
	}

}
