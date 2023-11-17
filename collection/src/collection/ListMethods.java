package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ListMethods {
	public static void main(String[] args) {
		
		//List<String> names = Arrays.asList("Amal","Anson"); 
		
		List<String> items = new ArrayList<>();
		
		items.add("Amal");
		items.add("Anson");
		items.add("Rohit");
		items.add("Amal");
		items.add(1,"Akhil");
		
		int total = items.size();
		System.out.println(total);
		
		Collections.sort(items);
		
		System.out.println(items);
		
		boolean checkName = items.contains("Amal");
		System.out.println(checkName);
	}

	

}
