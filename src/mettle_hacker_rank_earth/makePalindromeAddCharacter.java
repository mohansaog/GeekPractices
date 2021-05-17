package mettle_hacker_rank_earth;

public class makePalindromeAddCharacter {

	public static void main(String[] args) {
		String str = "ABCA";
		int p = AddCharToMakePaindrome(str);
		System.out.println(p);
	}

	private static int AddCharToMakePaindrome(String str) {
		int n = str.length();
		int flag = 0;
		int count = 0;
		while(str.length() > 0) {
			if(isPalindrom(str)) {
				flag = 1;
				break;
			}
			else {
				count++;
				str = str.substring(0,str.length() - 1);
			}
			//n--;
		}
		if(flag == 1)
			return count;
		else
			return 0;
	}

	private static boolean isPalindrom(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		if(sb.toString().compareTo(str) == 0)
			return true;
		else
			return false;
	}

}
