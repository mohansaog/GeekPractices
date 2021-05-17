package Arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.lang.*;
import java.util.LinkedList;
import java.util.Map;

public class SortByValueHashmap {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("aa", 10);
		hm.put("papa", 29);
		hm.put("aa",33 );
		hm.put("sdf", 51);
		hm.put("faa", 10);
		hm.put("dsdfg", 5);
		
		sortByValue(hm);

	}

	private static void sortByValue(HashMap<String, Integer> hm) {
		
		LinkedList<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)
			{
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		
		HashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		for(Map.Entry<String, Integer> aa : list) {
			lhm.put(aa.getKey(), aa.getValue());
		}
		for(Map.Entry<String, Integer> pp : lhm.entrySet()) {
			System.out.println(pp.getKey()+"  "+pp.getValue());
		}
		
	}

}
