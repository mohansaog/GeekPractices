package TCS;

public class PalindromePlay {

	public static void main(String[] args) {
		String str = "abcba";
		int n = str.length();
		char[] newChar = str.toCharArray();
		int i=0;
		int j = n-1;
		while(i<j) {
			char c = newChar[i];
			newChar[i] = newChar[j];
			newChar[j] = c;
			i++;j--;
		}
		String s = String.valueOf(newChar);
		
		if(str.equals(s)) {
			System.out.println("hahaha");
		}
	}
}
