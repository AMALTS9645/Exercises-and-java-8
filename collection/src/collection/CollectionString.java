package collection;

import java.util.HashSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class CollectionString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Collection<String> items = new HashSet<>();

//		System.out.println("Enter size of array: ");
//		int n = scan.nextInt();

//		System.out.println("Enter the names: ");
//		for (int i=0 ; i < n; i++) {
//			
//			items.add(scan.next());
//		}
		String temp = "";
		System.out.println("Enter names ");
		do {
			temp = scan.nextLine();
			items.add(temp);
		} while (!temp.isBlank());

		System.out.println(items);

		for (String name : items) {
			System.out.println(name);
		}

	}

}
