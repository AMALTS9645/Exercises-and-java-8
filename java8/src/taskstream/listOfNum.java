package taskstream;

import java.util.ArrayList;
import java.util.List;

public class listOfNum {

	static List<Integer> findAllEven(List<Integer> a) {

		List<Integer> evenArr = new ArrayList<>();

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) % 2 == 0) {
				evenArr.add(a.get(i));
			}
		}

		return evenArr;
	}

	static List<Integer> multiplyEven(List<Integer> a) {
		List<Integer> mulArr = new ArrayList<>();
		for (int i = 0; i < a.size(); i++) {
			int num = a.get(i) * 3;
			mulArr.add(num);
		}

		return mulArr;
	}

	static int add(List<Integer> a) {
		int sum = 0;
		for (int i = 0; i < a.size(); i++) {
			sum = sum + a.get(i);
		}

		return sum;
	}

	public static void main(String[] args) {
		List<Integer> arr = List.of(3, 6, 5, 4, 2, 7);

		List<Integer> temp = findAllEven(arr);

		List<Integer> multiplied = multiplyEven(temp);

		int result = add(multiplied);

		System.out.println(result);

//		for (Integer i : multiplied) {
//			System.out.println(i);
//		}

	}

}
