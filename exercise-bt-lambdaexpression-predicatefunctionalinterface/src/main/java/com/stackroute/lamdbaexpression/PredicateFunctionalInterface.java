package com.stackroute.lamdbaexpression;

import java.util.List;
import java.util.stream.Collectors;

public class PredicateFunctionalInterface {
	// write logic to find the values that starts with letter I in the given list
	public List<String> findPattern(List<String> list) {
		if (!list.isEmpty()) {
			return list.stream().filter(v -> v.startsWith("I")).distinct().collect(Collectors.toList());
		}
		return list;
	}
}
