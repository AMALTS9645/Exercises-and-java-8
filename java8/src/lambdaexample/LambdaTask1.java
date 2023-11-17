package lambdaexample;

interface checkable {
	int getLength(String str);
}

interface evenOdd {
	String evenOrOdd(int num);
}

interface evenOddBoolean {
	boolean evenOrOddd(int num);
}

interface divisible {
	boolean divisibleOrNot(int a, int b);
}

public class LambdaTask1 {

	public static void main(String[] args) {
		// Find the length of a string -- int getlen(string)

		// check if a number is even or odd

		// find if a number is divisible by another number

		checkable check = (s) -> s.length();

		int len = check.getLength("amal");

		System.out.println(len);

		evenOdd eveod = (n) -> n % 2 == 0 ? "even" : "odd";

		String res = eveod.evenOrOdd(7);

		System.out.println(res);

		evenOddBoolean eveodd = (n) -> n % 2 == 0;

		boolean ress = eveodd.evenOrOddd(8);

		System.out.println(ress);

		divisible isDiv = (a, b) -> a % b == 0 ? true : false;

		boolean result = isDiv.divisibleOrNot(10, 2);

		System.out.println(result);

	}

}
