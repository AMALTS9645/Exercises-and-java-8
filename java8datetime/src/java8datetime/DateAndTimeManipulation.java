package java8datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateAndTimeManipulation {

	public static void main(String[] args) {
		// current system date
		LocalDate today = LocalDate.now();
		System.out.println(today);

		// create a new date
		LocalDate date1 = LocalDate.of(2020, 4, 5);
		System.out.println(date1);

		// create a date from a string
		String str = "2019-10-22";
		LocalDate date2 = LocalDate.parse(str);
		System.out.println(date2);

		// Get month fYear and Day from a Date
		// Month in words
		Month month = today.getMonth();
		int monthNum = today.getMonthValue();
		int year = today.getYear();
		int day = today.getDayOfMonth();
		System.out.println("Month: " + month);
		System.out.println("Month Number: " + monthNum);
		System.out.println("Year: " + year);
		System.out.println("Day: " + day);

		// Comparing 2 dates//

		// find out which date value is after the other
		boolean check = date1.isAfter(date2);
		System.out.println(check);
		boolean check2 = date1.isBefore(date2);
		System.out.println(check2);

		// changing the formatt of date 

		String dateStr = "03-05-2023";
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date3 = LocalDate.parse(dateStr, format);
		System.out.println(date3.format(format));

	}

}
