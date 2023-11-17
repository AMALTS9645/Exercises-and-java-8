package polymorphism;

public class CalculatorMain {
	public static void main(String []args) {
		Calculator calc = new Calculator();
		
		System.out.println(calc.add(10, 15));
		System.out.println(calc.add(2.3f, 3.5f));
		System.out.println(calc.add("UST", "Global"));
		System.out.println(calc.add(5.3f, 6));
		
	}
}
