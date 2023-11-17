package self_practice;

public class NearlyLucky {
	public static int nearlyLucky(int[] arr, int n) {
		int countofLucky = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			int temp = arr[i];

			while (temp != 0) {
				int rem = temp % 10;
				if (rem == 3 || rem == 4 || rem == 5) {
					countofLucky++;
				}
				temp = temp / 10;
			}
			
			if (countofLucky == 3 || countofLucky == 4 || countofLucky == 5) {
				count++;
			}
			countofLucky =0;

		}
				return count;
	}

	public static void main(String[] args) {
		int[] arr = { 1345, 111354, 10935, 4357 };
		int len = arr.length;
		System.out.println(nearlyLucky(arr, len));

	}

}
