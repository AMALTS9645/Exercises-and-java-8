package com.stackroute.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogSortedListSearch {

	List<String> sortedCatalog = new ArrayList<>();

	// write here logic to get sorted Array List which is a global class variable
	public String catalogListSorter(List<String> unSortedCatalogList) {

		String resultString = "";
		boolean isInvalid = false;
		if (unSortedCatalogList == null) {
			resultString = "The catalog list is null";
		} else if (unSortedCatalogList.isEmpty()) {
			resultString = "The catalog List is empty";
		} else {
			for (String str : unSortedCatalogList) {
				if (str == null || str.isEmpty() || str.isBlank()) {
					resultString = "The catalog List contains empty or null or blank space as a value";
					isInvalid = true;
				}
			}
			if (isInvalid == false) {
				Collections.sort(unSortedCatalogList);
				resultString += unSortedCatalogList;
			}
			sortedCatalog.addAll(unSortedCatalogList);
		}

		return resultString;
	}

	// write here logic to search the input value in sorted Array List
	public String catalogListSearcher(String value) {

		if (value == null || value.isEmpty() || value.isBlank()) {
			return "Input is not accepted";
		} else {
			for (String str : sortedCatalog) {
				if (str.equalsIgnoreCase(value)) {
					return "Found: " + str;
				}
			}
		}
		return "Not Found";
	}
}
