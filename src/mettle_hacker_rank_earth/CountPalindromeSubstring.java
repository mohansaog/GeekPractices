package mettle_hacker_rank_earth;

public class CountPalindromeSubstring {

	public static void main(String[] args) {
		String s = "abbaeae";
		System.out.println(CountPalindrome(s));
	}

	private static int CountPalindrome(String s) {
		String temp = "";
		StringBuffer stf;
		int count = 0;
		
		for(int i=0;i<s.length();i++) {
			for(int j = i+1;j<=s.length();j++) {
				temp = s.substring(i,j);
				if(temp.length() >=2) {
					stf = new StringBuffer(temp);
					stf.reverse();
					if(stf.toString().compareTo(temp) == 0) {
						System.out.println(temp);
						count++;
				}
				}
			}
		}
		return count;
	}
	
}
