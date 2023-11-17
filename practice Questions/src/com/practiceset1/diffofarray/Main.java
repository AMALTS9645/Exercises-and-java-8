package com.practiceset1.diffofarray;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = scan.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter " + size + " array elements");
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		
		int res = UserMainCode.getBigDiff(arr);
		
		System.out.println("Difference:"+res);

	}

}
