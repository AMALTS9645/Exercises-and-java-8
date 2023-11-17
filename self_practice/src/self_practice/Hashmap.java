package self_practice;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {

// create a hashmap

		HashMap<Integer, String> languages = new HashMap<>();
		
		
		
//		 put() method to add elements

		languages.put(1, "Java");
		languages.put(2, "Python");
		languages.put(3, "JavaScript");
		System.out.println("HashMap after put(): " + languages);

		
//		 get() method to get value

		String value1 = languages.get(1);
		System.out.println("Value at index 1: " + value1);

		
//		 return set view of keys
//		 using keySet()

		System.out.println("Keys: " + languages.keySet());

		
		
//		 return set view of values
//		 using values()

		System.out.println("Values: " + languages.values());

		
		
//		 Print size of the Map

		System.out.println("Size of map is:- " + languages.size());


		
//		 change value of key 2

		languages.replace(2, "C++");
		System.out.println("hashmap after change: " + languages);


		
//		 remove element associated with key 2

		String value2 = languages.remove(2);
		System.out.println("Removed value: " + value2);


//		 Check if an element is present in the HashMap

		System.out.println(languages.containsKey(4));


	}

}
