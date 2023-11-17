package problems;

public class CountVowel {

	public static void main(String[] args) {
		String str = "amal";
//		str.toLowerCase();
//		
//		char[] ch = str.toCharArray();
//	int count = 0;
//		for(Character c:ch) {
//			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//				count++;
//			}
//		}
		System.out.println(str.replaceAll("[^aeiouAEIOU]",""));
		
		int count = str.replaceAll("[^aeiouAEIOU]","").length();
		
		System.out.println(count);

	}

}
