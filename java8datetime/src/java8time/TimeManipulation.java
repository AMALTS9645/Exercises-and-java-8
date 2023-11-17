package java8time;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeManipulation {

	public static void main(String[] args) {
		// current date and time
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);

		// current time
		LocalTime time = LocalTime.now();
		System.out.println(time);

		// create a new time
		LocalTime time1 = LocalTime.of(12, 38, 56);
		System.out.println(time1);

		// create a time from a string
		String str = "07:35:59";
		LocalTime time2 = LocalTime.parse(str);
		System.out.println(time2);

		// Get hour minute and seconds from a Date
		int hour = time.getHour();
		int minute = time.getMinute();
		int seconds = time.getSecond();

		System.out.println("Hour: " + hour);
		System.out.println("Minute: " + minute);
		System.out.println("Seconds: " + seconds);

		// Comparing 2 times//
		int h = time1.getHour() - time2.getHour();

		int timeDif = time1.compareTo(time2);
		System.out.println("Time difference:" + h);
		System.out.println("Time difference:" + timeDif);

		// changing the format of time

		String timeStr = "7:54:45";

//		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//		LocalDate date3 = LocalDate.parse(dateStr, format);
//		System.out.println(date3.format(format));
	}

}
