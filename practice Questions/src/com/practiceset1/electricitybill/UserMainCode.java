package com.practiceset1.electricitybill;

public class UserMainCode {
	public static int calculateElectricityBill(String prev, String cur, int charge) {
		int prevIndex = 0;
		int curIndex = 0;
		for (int i = 0; i < prev.length(); i++) {
			if (Character.isDigit(prev.charAt(i))) {
				prevIndex = i;
				break;
			}
		}

		for (int i = 0; i < cur.length(); i++) {
			if (Character.isDigit(cur.charAt(i))) {
				curIndex = i;
				break;
			}
		}
//		System.out.println(prevIndex);
//		System.out.println(curIndex);

		int prevReading = Integer.parseInt(prev.substring(prevIndex));
		int curReading = Integer.parseInt(cur.substring(curIndex));

		int dif = curReading - prevReading;

		return dif * charge;
	}
}
