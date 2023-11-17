package self_practice;

public class IsBinary {

	static boolean isBinary(String str) {
		char[] ch = str.toCharArray();
		boolean isTrue = false;
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '1' || ch[i] == '0') {
				count++;
			} else {
				count--;
			}
		}
		if (count == ch.length) {
			isTrue = true;
		}
		return isTrue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isBinary("110"));
	}

}
