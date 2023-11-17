package mapexpression;

import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		List<Integer> nums = List.of(2, 3, 4, 5, 6);

		// square all the numbers in the list
		// map function
		// T apply(T arg)

		nums.stream().map(n -> n * n).forEach(num -> System.out.println(num));

		List<String> names = List.of("Rahul", "Suraj", "Rohit", "Manish", "Raaj");

		// convert each name to uppercase
		names.stream().map(name -> name.toUpperCase()).forEach(n -> System.out.println(n));
	}

}
