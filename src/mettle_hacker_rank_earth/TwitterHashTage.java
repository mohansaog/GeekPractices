package mettle_hacker_rank_earth;

import java.util.ArrayList;
import java.util.HashMap;

public class TwitterHashTage {

	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
		String s1 = "Mohan";
		String s2 = "Akash";
		ArrayList<String> strArr = new ArrayList<String>();
		ArrayList<String> strArr1 = new ArrayList<String>();
		strArr.add("#sachin is great");
		strArr.add("is #sachin  great");
		strArr.add("mohan lal sao");
		strArr1.add("#sachin is great");
		strArr1.add("is #sachin  great");
		strArr1.add("mohan lal sao");
		hm.put(s1, strArr);
		hm.put(s2, strArr1);

		for (String ss : hm.keySet()) {
			int i = 0;
			while (i < hm.get(ss).size()) {
				if (hm.get(ss).get(i).contains("#sachin")) {
					System.out.println(hm.get(ss).get(i));
				}
				i++;
			}

		}
	}

}
