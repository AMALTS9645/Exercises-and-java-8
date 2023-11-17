package self_practice;

import java.util.Arrays;

public class ArrayEqual {

	public static boolean check(long A[], long B[], int N) {
		Arrays.sort(A);
		Arrays.sort(B);
		boolean isTrue = false;
		for (int i = 0; i < A.length; i++) {
			if (A[i] != B[i]) {
				isTrue = false;
				break;
			} else {
				isTrue = true;
			}
		}
		return isTrue;
	}

	public static void main(String[] args) {
		long[] a = { 1, 2, 3, 4, 5 };
		long[] b = { 5, 3, 4, 1, 2 };
		boolean res = check(a, b, a.length);
		System.out.println(res);
	}

}
