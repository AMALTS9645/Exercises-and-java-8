package mapsort.citycount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;

import java.util.List;

import java.util.Map;

import java.util.Set;

import java.util.TreeMap;

import java.util.stream.Collectors;

public class CityCounter {

	public static void main(String[] args) {

		List<String> cityNames = new ArrayList<>(

				List.of("New York", "Paris", "Paris", "London", "new york", "Sydney", "Paris", "Sydney", "Sydney"));

		Map<String, Integer> countMap = countCities(cityNames);

		System.out.println(countMap);

	}

	public static Map<String, Integer> countCities(List<String> cityNames) {

		Map<String, Integer> map = new TreeMap<>();

		List<String> lowerCity = cityNames.stream().map(c -> c.toLowerCase()).collect(Collectors.toList());

		for (String city : lowerCity) {

			if (map.containsKey(city)) {

				map.put(city, map.get(city) + 1);

			} else {

				map.put(city, 1);

			}

		}

		// List<Map.Entry<String, Integer>> mapEntry = new ArrayList<>(map.entrySet());
		// Comparator<Map.Entry<String, Integer>> com = Map.Entry.comparingByValue();
		// Comparator<Map.Entry<String, Integer>> com = ((a1, a2) ->
		// a1.getKey().compareTo(a2.getKey()));
		// Collections.sort(mapEntry, com);
		Comparator<Map.Entry<String, Integer>> val = Collections.reverseOrder(Map.Entry.comparingByValue());

		Set<Map.Entry<String, Integer>> mapEntry = map.entrySet();

		List<Map.Entry<String, Integer>> mapEntrys = mapEntry.stream()

				.sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).collect(Collectors.toList());
		

		Map<String, Integer> sortedMap = new LinkedHashMap<>();

		for (Map.Entry<String, Integer> entry : mapEntrys) {

			sortedMap.put(entry.getKey(), entry.getValue());

		}

		// Set<Map.Entry<String, Integer>> mapEntrySorted = sortedMap.entrySet();
		// List<Map.Entry<String, Integer>> mapEntrySort = mapEntrySorted.stream()
		// .sorted((e1, e2) ->
		// e1.getKey().compareTo(e2.getKey())).collect(Collectors.toList());
		// Map<String, Integer> sortedMaps = new LinkedHashMap<>();
		// for (Map.Entry<String, Integer> entry : mapEntrySort) {
		// sortedMaps.put(entry.getKey(), entry.getValue());

		// }

		return sortedMap;

	}

}
