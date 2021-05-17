package Arrays;

import java.util.HashSet;

public class FirstCharOccuranceInString {

	public static void main(String[] args) {

		String str = "mohano";
		char[] cstr = str.toCharArray();
		char p = checkOccurance(cstr); 
		System.out.println(p);
	}

	private static char checkOccurance(char[] cstr) {
		HashSet<Character> hq = new HashSet<Character>();
		for(int i = 0;i<cstr.length;i++) {
			char c = cstr[i];
			
			if(hq.contains(c))
				return c;
			else
				hq.add(c);
		}
		return '\0';
	}

}
