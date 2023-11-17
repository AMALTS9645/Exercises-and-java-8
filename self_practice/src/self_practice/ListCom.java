package self_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ListCom {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>(List.of("yv","abc","xyz","abfg","akhycdg"));
		
		Set<String> set = new TreeSet<>();
		
		for(String s: list) {
			set.add(s);
		}
		
		List<String> descList= set.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(descList);
		
		
		
		List<String> lengthList= set.stream().sorted((s1,s2)->s1.length() - s2.length()).collect(Collectors.toList());
		System.out.println(lengthList);
		
		
		

	}

}
