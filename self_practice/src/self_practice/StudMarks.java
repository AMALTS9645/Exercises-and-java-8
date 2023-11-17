package self_practice;

import java.util.Map;
import java.util.TreeMap;

public class StudMarks {

	public static void main(String[] args) {
		int[] arr1 = {85, 72, 91, 60, 78, 95, 80, 68, 82, 87};
		int[] arr2 = {90, 80, 70, 60};
		
		Map<Character,Integer> gradeMap = new TreeMap<>();
		for(Integer score: arr1) {
			if(score >=arr2[0]) {
				if(gradeMap.containsKey('A')) {
					gradeMap.put('A', gradeMap.get('A') + 1);
				}else {
					gradeMap.put('A', 1);
				}
				
			}else if(score >=arr2[1]) {
				if(gradeMap.containsKey('B')) {
					gradeMap.put('B', gradeMap.get('B') + 1);
				}else {
					gradeMap.put('B', 1);
				}
			}else if(score >=arr2[2]) {
				if(gradeMap.containsKey('C')) {
					gradeMap.put('C', gradeMap.get('C') + 1);
				}else {
					gradeMap.put('C', 1);
				}
			}else if(score >=arr2[3]) {
				if(gradeMap.containsKey('D')) {
					gradeMap.put('D', gradeMap.get('D') + 1);
				}else {
					gradeMap.put('D', 1);
				}
			}
		}
		
		System.out.println(gradeMap);

	}

}
