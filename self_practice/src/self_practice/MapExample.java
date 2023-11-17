package self_practice;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String, String> dictionary = new HashMap<String, String>();// Creating HashMap

		dictionary.put("reflecting", " To throw or bend back (light or sound, for example) from a surface");
		dictionary.put("throw", "To propel through the air with a motion of the hand or arm.");
		dictionary.put("propel", " To cause to move forward or onward. See Synonyms at push.");
		dictionary.put("bright", "Emitting or reflecting light readily or in large amounts; shining."); // Put elements
//		dictionary.put(null, "bfhdbsfhdbsf");

//		for (String key : dictionary.keySet()) {
//			System.out.println(key + " : " + dictionary.get(key));
//		}

//		dictionary.put("bright", "aaaaaaaa");

//		dictionary.put(null, "bfhdbsfhdbsf");

//		for (Map.Entry<String, String> entry : dictionary.entrySet()) {
//			System.out.println(entry);
//		}
//		dictionary.forEach((K,V)->System.out.println(K+" "+V));
//		System.out.println(dictionary.containsKey("bright"));

//
//		System.out.println(
//				dictionary.containsValue("Emitting or reflecting light readily or in large amounts; shining."));

//		dictionary.remove("throw");
//		
//		System.out.println("\n After removing throw");
//		
		for (String key : dictionary.keySet()) {
			System.out.println(key + " : " + dictionary.get(key));
		}

	}

}
