package self_practice;

public class PrimeCountArray {

	public static void main(String[] args) {

		int[] arr = { 7, 24, 5, 29, 55, 61 };

		int count = 0;

		for (Integer num : arr) {
			boolean flag = true;
			if (num != 1) {
				for (int i = 2; i < num / 2; i++) {
					if (num % i == 0) {
						flag = false;
						break;
					}
				}
				if (flag) {
					count++;
				}
			}

		}

		System.out.println(count);
	}

}
