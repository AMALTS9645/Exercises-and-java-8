package problems;

public class RemoveVowels {

	public static void main(String[] args) {
		String str = "amalamal";
		str.toLowerCase();
		char[] ch = str.toCharArray();
		
		String s ="";
		
		for(char c:ch) {
			if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
				s+=c;
			}
		}
		System.out.println(s);

	}

}
