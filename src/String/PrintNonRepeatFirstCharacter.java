package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintNonRepeatFirstCharacter {

	public static void main(String[] args) {
		String str = "evryone";
		char p = nonRepeatFirstChar(str);
		System.out.println(p);
	}

	private static char nonRepeatFirstChar(String str) {
		// TODO Auto-generated method stub
		Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();

		for (Character c : str.toCharArray()) {
			hm.put(c, hm.containsKey(c) ? hm.get(c) + 1 : 1);
		}

		for (Map.Entry<Character, Integer> em : hm.entrySet()) {
			if (em.getValue() == 1) {
				return em.getKey();
			}
		}

		return '\0';
	}

}
