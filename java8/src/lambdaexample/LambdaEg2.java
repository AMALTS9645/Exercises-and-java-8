package lambdaexample;

interface Calculator {
	int calculate(int x, int y);
}

public class LambdaEg2 {

	public static void main(String[] args) {
		Calculator c1 = (x, y) -> x + y;
		Calculator c2 = (x, y) -> x - y;
		Calculator c3 = (x, y) -> x > y ? x : y;

		// OR
//		Calculator c3 = (x, y) -> {
//			if(x>y) {
//				return x;
//			}else
//				return y;
//		};

		int result = c1.calculate(10, 30);
		int result2 = c2.calculate(10, 30);

		System.out.println(result);
		System.out.println(result2);

		// largest bw x and y

		int largest = c3.calculate(10, 30);
		System.out.println(largest);

	}

}
