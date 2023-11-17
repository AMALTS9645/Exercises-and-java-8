package self_practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonSort {
	public static int[] findCommon(int[] arr, int[] arr2) {
		Set<Integer> array1 = new HashSet<>();
		Set<Integer> common = new HashSet<>();

		for (Integer a : arr) {
			array1.add(a);
		}

		int count = 0;
		for (Integer e : arr2) {
			if (array1.contains(e)) {
				common.add(e);
				count++;
			}
		}
		
//		System.out.println(common);

		int[] arrCommon = new int[count];

		int i = 0;
		for (Integer s : common) {
			arrCommon[i] = s;
			i++;
		}
		return arrCommon;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arr2 = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

		int[] res = findCommon(arr, arr2);
		
		Arrays.sort(res);

		for (int f : res)
			System.out.println(f);
		
	}

}
