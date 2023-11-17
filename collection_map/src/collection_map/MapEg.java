package collection_map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEg {

	public static void main(String[] args) {
//		Map<Integer, String> nameMap = new HashMap<>();
		Map<Integer, String> nameMap = new TreeMap<>();//sorted
		
		nameMap.put(100, "amal");
		nameMap.put(20, "akhil");
		nameMap.put(37, "anson");
		nameMap.put(400, "acdac");
		nameMap.put(54, "aavfvfe");
		
		for(int key : nameMap.keySet()) {
			System.out.println(key+"-"+nameMap.get(key));
		}

	}

}
