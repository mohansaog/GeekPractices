package TCS;

import java.util.HashMap;
import java.util.Map;

public class CountCharWithASCII {

	public static void main(String[] args) {
		String str = "ccca";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			if(!hm.containsKey(str.charAt(i)))
				hm.put(str.charAt(i), 1);
			else
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
		}
		for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
			if(((entry.getKey())-96) != entry.getValue()) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("yes");
	}

}
