package String;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {

	public static void main(String[] args) {
		String str = "Mohanlalsao";
		char[] cstr = str.toCharArray();

		HashMap<Character, Integer> hq = new HashMap<Character, Integer>();

		for (char c : cstr) {
			if (hq.containsKey(c))
				hq.put(c, hq.get(c) + 1);
			else
				hq.put(c, 1);
		}

		for (Map.Entry<Character,Integer> entry : hq.entrySet()) {
			int p =  entry.getValue();
			if (p > 1)
				System.out.println(entry.getKey());
		}
	}

}
