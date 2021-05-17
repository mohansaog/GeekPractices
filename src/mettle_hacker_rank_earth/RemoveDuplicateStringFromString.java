package mettle_hacker_rank_earth;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class RemoveDuplicateStringFromString {

	public static void main(String[] args) {
		String str = "mohan sao ha to mohan h a";
		String[] strarr = str.split(" ");
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		Set<String> ss = new HashSet<String>();
		for (String s : strarr) {
			ss.add(s);
		}
		for (String p : ss)
			System.out.print(p + " ");
	}
}
