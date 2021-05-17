package mettle_hacker_rank_earth;

public class FindLongestPalindromeSubstringInString {

	public static void main(String[] args) {
		String s = "forgeeksskeegfor";
		String s1 = findLongetstSubString(s);
		System.out.println(s1);
	}

	private static String findLongetstSubString(String s) {
		String temp = "";
		String p = "";
		StringBuilder sb;
		int mai = 1;
		
		for(int i=0;i<s.length();i++) {
			for(int j = i+1;j<=s.length();j++) {
				temp = s.substring(i,j);
				sb = new StringBuilder(temp);
				if(temp.length() >=2) {
					sb.reverse();
					if(sb.toString().compareTo(temp) == 0) {
						if(sb.length() > mai) {
							mai = sb.length();
							p = sb.toString();
						}
					}
						
				}
			}
		}
		System.out.println(mai);
		return p;
	}

}
