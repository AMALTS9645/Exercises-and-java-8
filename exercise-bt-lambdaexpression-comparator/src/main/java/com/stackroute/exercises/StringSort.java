package com.stackroute.exercises;

import java.util.List;
import java.util.stream.Collectors;

public class StringSort {

	// write here logic to sort a string List
	public String stringSorter(List<String> stringList, String sortingOrder) {
		String listString = "";

		if (stringList == null || stringList.isEmpty() || sortingOrder == null || sortingOrder.isEmpty()
				|| sortingOrder.isBlank()) {
			listString = listString + "Given stringList or sortingOrder is empty, null or blank space";
		} else {
			for (String s : stringList) {
				if (s.isBlank() || s.isEmpty() || s == null) {
					return listString + "The list contains an empty or blank space value";
				}
			}
			if (stringList.size() == 1) {
				return listString + "The list contains only one value";
			}
			if (sortingOrder.equalsIgnoreCase("asc")) {
				List<String> result = stringList.stream().sorted((s1, s2) -> s1.compareTo(s2))
						.collect(Collectors.toList());
				listString = listString + result;
			} else if (sortingOrder.equalsIgnoreCase("desc")) {
				List<String> result2 = stringList.stream().sorted((s1, s2) -> s2.compareTo(s1))
						.collect(Collectors.toList());
				listString = listString + result2;
			} else {
				listString = listString + "No sorting order present for given string '" + sortingOrder
						+ "' , 'asc' for ascending order sort and 'desc' for descending order sort";
			}
		}

		return listString;
	}
}
