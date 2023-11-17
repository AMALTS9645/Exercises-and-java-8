package stringoccurance;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class StringOccurance {

	public static void main(String[] args) {
		Map<Character, Integer> occurance = new TreeMap<>();

		String str = "harsha";
		char[] chars = str.toCharArray();

		int count = 0;

		for (char c : chars) {
			if (!occurance.containsKey(c)) {
				occurance.put(c, 1);
			} else {
				count = occurance.get(c) + 1;
				occurance.put(c, count);
			}

		}

		for (Character key : occurance.keySet()) {
			System.out.println(key + "-" + occurance.get(key));
		}

		for (Entry<Character, Integer> entry : occurance.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
//		occurance.keySet().forEach(k -> System.out.println(occurance.get(k)));

	}

}
