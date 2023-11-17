package self_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayReverse {

	static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {

		List<Integer> reverse = new ArrayList<>();

		int requiredIndex = k - 1;
		int start = 0;
		int end = n - 1;

		while (requiredIndex <= end) {
			for (int i = requiredIndex; i >= start; i--) {

				reverse.add(arr.get(i));

			}
			start += k;
			requiredIndex += k;

		}

		for (int i = end; i >= start; i--) {
			reverse.add(arr.get(i));
		}
		
		for (int i = 0; i < reverse.size(); i++) {
			System.out.println(reverse.get(i));
		}
		
		arr.removeAll(arr);

	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(2);
		arr.add(5);
		arr.add(7);
		arr.add(8);
		arr.add(9);
		arr.add(1);
		arr.add(6);
		arr.add(4);
		arr.add(3);
		int n = arr.size();
		int k = 3;

		ArrayReverse.reverseInGroups(arr, n, k);
	}
}