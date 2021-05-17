package Arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortByValueHashMap2 {

	public static void main(String[] args) {
		Map<String,Integer> hm = new HashMap<String, Integer>();
		hm.put("mohan1", 6);
		hm.put("mohan2", 13);
		hm.put("mohan3", 960);
		hm.put("mohan4", 190);
		hm.put("mohan5", 9);
		hm.put("sohan", 901);

		toSort(hm);
	}

	private static void toSort(Map<String, Integer> hm) {
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1,Map.Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		
		/*
		 * LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		 * for(Map.Entry<String, Integer> aa: list) lhm.put(aa.getKey(), aa.getValue());
		 */
		  
		  for(Map.Entry<String, Integer> bb : list)
		  System.out.println(bb.getKey()+"  "+bb.getValue());
		 
		
	}

}
