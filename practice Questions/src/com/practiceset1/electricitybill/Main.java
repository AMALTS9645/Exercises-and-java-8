package com.practiceset1.electricitybill;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the previous reading: ");
		String prev = scan.nextLine();
		System.out.println("Enter the Current reading: ");
		String curr = scan.nextLine();
		System.out.println("Enter the charge per unit: ");
		int charge = scan.nextInt();

		int result = UserMainCode.calculateElectricityBill(prev, curr, charge);
		System.out.println("The bill is: " + result);

	}

}
