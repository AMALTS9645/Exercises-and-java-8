package self_practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayRemove {

	public static void main(String[] args) {
		int[] arr = {25,14,56,15,36,1};
		
		List<Integer> list = new ArrayList<>();
		
		for(int e:arr) {
			list.add(e);
		}

		list.remove((Object)56);
		
		System.out.println(list);
		

	}

}
