package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomException {
	static int age;
	static String name;
	
	public static void readName() throws Exception {
		System.out.println("Enter the name :");
		Scanner scan = new Scanner(System.in);
		name = scan.nextLine();
		
		if(name.length() < 3) {
			throw new Exception("name must contain atleast 3 characters");
		}
	}
	
		
		
	public static void readAge() {
		System.out.println("Enter the age :");
		Scanner scan = new Scanner(System.in);
		age = scan.nextInt();
		
		if(age <= 0) {
			throw new ArithmeticException("age must be a positive number");
		}
	}

	public static void main(String[] args) {
		
		try {
			readAge();
			readName();
			System.out.println("age is: "+age);
			System.out.println("name is: "+name);
		}catch(ArithmeticException e){
			System.err.println(e.getMessage());
		}catch(Exception e){
			System.err.println(e.getMessage());
		}
	}
}
