package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {

	public static void main(String[] args) {
		Collection<Integer> items = new ArrayList<>();
		
		items.add(102);
		items.add(103);
		items.add(104);
		items.remove(104);
		
		System.out.println(items);

	}

}
