package com.practiceset1.diffofarray;

public class UserMainCode {
	public static int getBigDiff(int[] arr) {
		int small = arr[1];
		int large = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				small = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				large = arr[i];
			}
		}
		System.out.println("small number:" + small);
		System.out.println("large number:" + large);
		return large - small;
	}
}
