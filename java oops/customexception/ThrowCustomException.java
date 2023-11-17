package customexception;

import java.util.Scanner;

public class ThrowCustomException {
	
	static int age;
	static String name;
	
	public static void readUserDetails()  {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name and age : ");
		name = scan.nextLine();
		age = scan.nextInt();
		if(name.length()<3) {
			throw new InvalidNameException("Name should have atleast 3 characters");
		}
		if(age <= 0) {
			throw new InvalidAgeException("Age should be a positive value");
		}
	}


	
	public static void main(String []args) {
		try {
			readUserDetails();
			System.out.println("Age = "+age);
			System.out.println("Name = "+name);
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			System.out.println("Closing resources...");

		}
		

	}
}
