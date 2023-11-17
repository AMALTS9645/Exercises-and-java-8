package citycountcollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CityMain {

	public static void main(String[] args) {
		List<String> cities = new ArrayList<>(
				List.of("New York", "Paris", "Paris", "London", "new york", "Sydney", "Paris", "Sydney", "Sydney"));

		Map<String, Integer> res = CityCounter.countCities(cities);

		res.forEach((K, V) -> System.out.println(K + " " + V));

	}

}
