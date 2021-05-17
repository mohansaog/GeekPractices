package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class MaxOccuranceCharacterInString_1 {

	public static void main(String[] args) {
		String str1 = "mohanlalsaojihaito";
		char[] str = str1.toCharArray();
		Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length; i++) {
			if (hm.containsKey(str[i]))
				hm.put(str[i], hm.get(str[i]) + 1);
			else
				hm.put(str[i], 1);
		}
		int max = Integer.MAX_VALUE;
		char haha = ' ';
		for (Map.Entry<Character, Integer> em : hm.entrySet()) {
			System.out.println(em.getKey()+" "+em.getValue());
		}
		for (Map.Entry<Character, Integer> em : hm.entrySet()) {
			if (em.getValue() < max) {
				max = em.getValue();
				haha = em.getKey();
			}
		}
		System.out.println(haha);
	}

}
