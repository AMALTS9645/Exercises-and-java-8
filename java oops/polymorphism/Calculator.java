package polymorphism;

public class Calculator {
	
	//Method overloading
	
	public int add(int value1, int value2) {
		return value1+value2;
	}
	
	public float add(float value1, float value2) {
		return value1+value2;
	}
	
	public String add(String value1, String value2) {
		return value1 + " " + value2;
	}
}
