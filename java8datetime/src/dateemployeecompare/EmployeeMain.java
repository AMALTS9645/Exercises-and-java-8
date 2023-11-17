package dateemployeecompare;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the date in the format yyyy-mm-dd");
		String date = sc.nextLine();

		LocalDate date1 = LocalDate.parse(date);

		Employee e1 = new Employee(1001, "Mohith", 43000, LocalDate.of(2020, 10, 26));
		Employee e2 = new Employee(1002, "Amal", 63000, date1);

		System.out.println(e1);
		System.out.println(e2);
	}

}
