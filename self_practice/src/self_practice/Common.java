package self_practice;

import java.util.*;

public class Common {

	public static int[] commonelements(int[] arr1, int[] arr2) {

		Set<Integer> set = new HashSet<>();
		Set<Integer> commonset = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			if (set.contains(arr2[i])) {
				commonset.add(arr2[i]);
			}
		}

		int[] arr = new int[arr1.length];

		Iterator it = commonset.iterator();

		int i = 0;
		while (it.hasNext()) {
			int n = (int) it.next();
			arr[i] = n;
			i++;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 3, 5, 6, 8, 9, 1 };
		int[] arr2 = { 4, 6, 2 };

		int[] arrRes = commonelements(arr1, arr2);

		for (int i = 0; i < arrRes.length; i++) {
			System.out.println(arrRes[i]);
		}
	}
}
