package streamapi;

import java.util.List;
import java.util.stream.Stream;

public class StreamFilter {

	public static void main(String[] args) {

		// Stream<Integer>nums =Stream.of(10,20,30,40,50);

		List<Integer> nums = List.of(10, 20, 30, 40, 50, 60);
		Stream<Integer> numStream = nums.stream();

		numStream.filter(i -> i % 20 == 0).forEach(i -> System.out.println(i));

		nums.forEach(i -> System.out.println(i));
		
		
		//_____________________________________________________

		List<String> names = List.of("Rahul", "Suraj", "Rohit", "Manish", "Raaj");

		// print all names start with R
		System.out.println("names start with R: ");
		names.stream().filter(name -> name.startsWith("R")).forEach(n -> System.out.println(n));

		// print all names having more than 5 characters
		System.out.println("names having more than 5 characters: ");
		names.stream().filter(name -> name.length() >= 5).forEach(n -> System.out.println(n));

		// plug two filters together
		System.out.println("plug two filters: ");
		names.stream().filter(name -> name.startsWith("R")).filter(name -> name.length() > 3)
				.forEach(n -> System.out.println(n));
	}

}
