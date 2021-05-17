package testing;

import java.util.HashMap;
import java.util.Map;

public class Sample {
	public static void main(String args[]) {
		 String[] str = {"eat","tea","tan","ate","nat","bat"};
		 HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		 for(int i=0;i<str.length;i++) {
			 int count = 0;
			 int j = 0;
			 while(j<str[i].length()) {
				 count += str[i].charAt(j);
				 j++;
			 }
			 hm.put(str[i], count);
		 }
		 
		 for(Map.Entry<String, Integer> em : hm.entrySet()) {
			 //if(em.getValue() == )
		 }
		 
		 
		 
		//[["bat"],["nat","tan"],["ate","eat","tea"]]
	}
}
