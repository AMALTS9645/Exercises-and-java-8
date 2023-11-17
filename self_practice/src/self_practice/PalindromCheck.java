package self_practice;

public class PalindromCheck {

	public static int palinArray(int[] a, int n) {
		int count = 0;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			
			temp = a[i];
			int rev = 0;
			while (temp != 0) {
				int r = temp % 10;
				rev = rev * 10 + r;
				temp = temp / 10;
//				System.out.println(rev);

				if (rev == a[i]) {
					count++;
				}
			}

		}
		System.out.println(count);
		if (count == n) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 111, 222, 333, 444 };
		System.out.println(palinArray(arr, arr.length));

	}

}
