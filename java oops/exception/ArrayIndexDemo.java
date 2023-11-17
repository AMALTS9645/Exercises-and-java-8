package exception;

public class ArrayIndexDemo {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };

		try {
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.err.println("Error : " + ex.getMessage());
		}

		System.out.println("Execution completed");
	}

}
