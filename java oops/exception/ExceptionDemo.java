package exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		int x = 10, y = 0;
		System.out.println("Started dividing " + x + " with " + y);
		try {
			int res = x / y;
			System.out.println("Result: " + res);
		} catch (ArithmeticException ex) {
			System.out.println("Error : " + ex.getMessage());
		}

		System.out.println("Execution completed");
	}

}
