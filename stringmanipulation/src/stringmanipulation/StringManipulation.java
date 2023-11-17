package stringmanipulation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringManipulation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();

		StringBuffer string = new StringBuffer(str);

		string.reverse();
		System.out.println(string);

		if (str.equalsIgnoreCase(String.valueOf(string))) {
			System.out.println("palindrome");
		}

		str = str.replaceAll("\\s", "");
		System.out.println(str);

		Map<Character, Integer> map = new HashMap<>();

		char[] ch = str.toCharArray();

		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, (int) map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		System.out.println(map);

		List<Map.Entry<Character, Integer>> details = map.entrySet().stream()
				.sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue())).collect(Collectors.toList());
		
		System.out.println(details);
	}

}
