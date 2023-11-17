package problems;

import java.util.ArrayList;
import java.util.List;

public class StringCount {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(List.of("  "," ","dsc","cdsc","awdv","kjhj"));
		
		List<String> li = new ArrayList<>();
		
		int count =0;
		for(String s:list) {
			if(s.length() > 3) {
				count++;
			}
			if(!s.isBlank()) {
				li.add(s);
			}
		}
		
		System.out.println("Count of Strings with length more than 3: "+count);
		System.out.println("Space removed array: " +li);
		
		

	}

}
