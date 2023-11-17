package exception;

import java.util.Scanner;

public class ExceptionPgm {
	
		static String name;
		static int age;
		
		
			
		public static void readDetails()  throws Exception {
			
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the name :");
			name = scan.nextLine();
			
			if(name.length() < 3) {
				throw new Exception("name must contain atleast 3 characters");
			}
			
		
			System.out.println("Enter the age :");
			age = scan.nextInt();
			
			if(age <= 0) {
				throw new Exception("age must be a positive number");
			}
		
		}

		public static void main(String[] args) {
			
			try {
				
				readDetails();
				
				System.out.println("age is: "+age);
				System.out.println("name is: "+name);
			}catch(Exception e){
				System.err.println(e.getMessage());
			}
		}
}
