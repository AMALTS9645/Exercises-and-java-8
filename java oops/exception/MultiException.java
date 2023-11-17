package exception;

public class MultiException {

		public static void main(String[] args) {

			int[] arr = new int[] { 1, 2, 0, 4, 5, 6, 7 };

			try {
				int res = arr[0] / arr[2];
					System.out.println(res);
				
			}catch (ArithmeticException ex) {
				System.err.println("Error : " + ex.getMessage());
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.err.println("Error : " + ex.getMessage());
			}catch (Exception ex) {
				System.err.println("Error : " + ex.getMessage());
			}


			System.out.println("Execution completed");
		}

	}
