package polymorphism;
import java.util.Scanner;

public class StudentMarksCalcImpl {
	public static void main(String []args){

		
		StudentMarks stud = new StudentMarks();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1.Medical\n2.Non-Medical\n3.Commerse");
		System.out.println("Enter your Stream");
		
		int stream = scan.nextInt();
		
		switch(stream) {
		
		case 1 : 
			System.out.println("Enter the mark for maths");
			var maths = scan.nextInt();
			System.out.println("Enter the mark for physics");
			var physics = scan.nextInt();
			System.out.println("Enter the mark for chemistry");
			var chemistry = scan.nextInt();
			System.out.println("Enter the mark for biology");
			var biology = scan.nextInt();
			
			System.out.println(stud.calculateMarks(maths, biology,chemistry,physics));
			
			break;
			
			
		case 2 : 
			System.out.println("Enter the mark for maths");
			var maths1 = scan.nextInt();
			System.out.println("Enter the mark for physics");
			var physics1 = scan.nextInt();
			System.out.println("Enter the mark for chemistry");
			var chemistry1 = scan.nextInt();
			
			System.out.println(stud.calculateMarks(physics1, chemistry1, maths1));
			
			break;
			
			
		case 3 : 
			System.out.println("Enter the mark for businessStudies");
			var businessStudies = scan.nextInt();
			System.out.println("Enter the mark for finance");
			var finance  = scan.nextInt();
			System.out.println("Enter the mark for accounts");
			var accounts = scan.nextInt();
			
			System.out.println(stud.calculateMarks(businessStudies, finance , accounts));
			
			break;
			
		default: System.out.println("Enter a valid option");
					break;
		}
        
		
        // Read stream value from user and marks for different subjects based on the stream selected

        // Display the total marks
        

    }

}
