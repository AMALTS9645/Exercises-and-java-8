package collectionsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import collection_set.Customer;

public class SortingCollection {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(10,20,100,30);
		List<String> names = Arrays.asList("amal","anson","akhil");
		
		Collections.sort(nums);
		Collections.sort(names);
		
		System.out.println(nums);
		System.out.println(names);
		
		List<Customer> customers = new ArrayList<>();
		
		Customer c1 = new Customer(101, "amal", "amal@gmail.com");
		Customer c2 = new Customer(102, "anson", "anson@gmail.com");
		Customer c3 = new Customer(103, "rohit", "rohit@gmail.com");
		Customer c4 = new Customer(104, "amalSCS", "amalSCS@gmail.com");

		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);
		
		Collections.sort(customers);
		
		for(Customer c : customers) {
			System.out.println(c);
		}

	}

}
