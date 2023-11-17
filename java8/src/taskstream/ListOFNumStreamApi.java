package taskstream;

import java.util.List;
import java.util.stream.Collectors;

public class ListOFNumStreamApi {

	public static void main(String[] args) {
		List<Integer> arr = List.of(3, 6, 5, 4, 2, 7);
		System.out.println("Original List " + arr);
		List<Integer> evens = arr.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("Filtered List " + evens);
		List<Integer> multiplied = evens.stream().map(i -> i * 3).collect(Collectors.toList());
		System.out.println("Modified List " + multiplied);
		int result = multiplied.stream().reduce((x, y) -> x + y).get();
		System.out.println("Final output");
		System.out.println(result);

	}

}
//predicate : is an interface there is a method called test "boolean test(generic input)"