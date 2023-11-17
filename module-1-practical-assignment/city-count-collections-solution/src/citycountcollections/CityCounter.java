package citycountcollections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class CityCounter {
	public static Map<String, Integer> countCities(List<String> cities) {

		Map<String, Integer> cityCount = new LinkedHashMap<>();

		List<String> lowerCity = cities.stream().map(c -> c.toLowerCase()).collect(Collectors.toList());
		Comparator<String> com = (s1, s2) -> s2.compareTo(s1);
		Collections.sort(lowerCity, com);

		for (String city : lowerCity) {
			
			if (cityCount.containsKey(city)) {
				cityCount.put(city, cityCount.get(city) + 1);
			} else {
				cityCount.put(city, 1);
			}
		}

		Set<Entry<String, Integer>> entries = cityCount.entrySet();

		entries.stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).collect(Collectors.toList());
		Map<String, Integer> result = new LinkedHashMap<>();

		for (Entry e : entries) {
			result.put((String) e.getKey(), (Integer) e.getValue());
		}

		return result;
	}
}
