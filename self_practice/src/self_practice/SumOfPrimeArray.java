package self_practice;

import java.util.Scanner;

public class SumOfPrimeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array");
		int size = sc.nextInt();
		System.out.println("Enter the numbers: ");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int sumOfPrime = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i] / 2;
			boolean isPrime = true;
			for (int j = 2; j <= num; j++) {
				if (arr[i] % j == 0) {
					isPrime = false;
					break;
				}

			}

			if (isPrime) {
				count++;
				sumOfPrime += arr[i];
			}

		}

		System.out.println("Count of prime numbers are: " + count);
		System.out.println("Sum of prime numbers is: " + sumOfPrime);

	}
}
