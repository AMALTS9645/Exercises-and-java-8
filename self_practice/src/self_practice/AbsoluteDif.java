package self_practice;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AbsoluteDif {

	public static void main(String[] args) {
		List<Integer> positive = new ArrayList<>();
		List<Integer> negative = new ArrayList<>();

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of positive array");
		int size1 = scan.nextInt();

		System.out.println("Enter " + size1 + " positive numbers");
		for (int i = 0; i < size1; i++) {
			int n = scan.nextInt();
			if (n > 0) {
				positive.add(n);
			} else if (n < 0) {
				System.out.println("Enter a positive number");
				i--;
			}

		}

		System.out.println("Enter the size of negative array");
		int size2 = scan.nextInt();

		System.out.println("Enter " + size2 + " negative numbers");
		for (int j = 0; j < size2; j++) {
			int n2 = scan.nextInt();
			if (n2 < 0) {
				negative.add(n2);
			} else if (n2 > 0) {
				System.out.println("Enter a negative number");
				j--;
			}

		}
		int small = Integer.MAX_VALUE;
		int key = 0;
		int value = 0;
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < positive.size(); i++) {

			for (int j = 0; j < negative.size(); j++) {
				int absol = positive.get(i) - negative.get(j);
				if (Math.abs(absol) <= small) {
					small = positive.get(i) - negative.get(j);
					key = positive.get(i);
					value = negative.get(j);
				}
			}
			map.put(key, value);

		}

		System.out.println(map);

		int minKey = 0;
		int minValue = 0;
		int dif = Integer.MAX_VALUE;
		for (Integer keys : map.keySet()) {
			int difference = keys - map.get(keys);
			if (Math.abs(difference) <= dif) {
				dif = Math.abs(keys - map.get(keys));
				minKey = keys;
				minValue = map.get(keys);
			}
		}

		System.out.println("Key is: " + minKey + " Value is: " + minValue);

	}
}
