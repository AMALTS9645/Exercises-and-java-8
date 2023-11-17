package self_practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SmallestAbsoluteDifference {
	static Map<Integer, Integer> smallestAbsoluteDiffFinder(int[] arr1, int[] arr2) {
		Map<Integer, Integer> smallestPairMap = new LinkedHashMap<>();
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (Math.abs(arr1[i] - arr2[j]) <= smallest) {
					smallest = Math.abs(arr1[i] - arr2[j]);
					// System.out.println(smallest);
				}
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (Math.abs(arr1[i] - arr2[j]) == smallest) {
					smallestPairMap.put(arr1[i], arr2[j]);
				}
			}
		}
		return smallestPairMap;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of 1st array");
		int size1 = sc.nextInt();
		int[] arr1 = new int[size1];
		System.out.println("Enter " + size1 + " numbers");
		for (int i = 0; i < size1; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the length of 2nd array");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		System.out.println("Enter " + size2 + " numbers");
		for (int i = 0; i < size2; i++) {
			arr2[i] = sc.nextInt();
		}
		Map<Integer, Integer> smallestPairMap = SmallestAbsoluteDifference.smallestAbsoluteDiffFinder(arr1, arr2);
		smallestPairMap.forEach((k, v) -> System.out.println(k + ":" + v));
	}
}
