package sets;

import java.util.Set;
import java.util.TreeSet;

public class TreesetEg {


		public static void main(String[] args) {
			//hashset is unique
			//it doesnt follow any order
			Set<Integer> nums = new TreeSet<>();
			
			//in treeset all elements will be sorted
			//linkedhashset follows the order of insertion
			
			nums.add(10);
			nums.add(100);
			nums.add(20);
			nums.add(5);
			nums.add(150);
			
			System.out.println(nums);

		}

	}


