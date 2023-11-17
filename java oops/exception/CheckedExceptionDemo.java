package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CheckedExceptionDemo {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("hello.txt");
			Scanner scan = new Scanner(reader);
			String line = scan.nextLine();
			System.out.println(line);
			
		}catch(FileNotFoundException ex) {
			System.err.println(ex.getMessage());
		}
	}
}
