package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FindAnagramInStringArray_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"cat","god","dog","act","ogd"};
		printAnagram(str);
	}

	private static void printAnagram(String[] str) {
		HashMap<String,ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
		for(int i=0;i<str.length;i++) {
			String word = str[i];
			char[] newchar = word.toCharArray();
			Arrays.sort(newchar);
			String newWord = new String(newchar);
			if(hm.containsKey(newWord)) {
				hm.get(newWord).add(word);
			}
			else {
				ArrayList<String> words = new ArrayList<String>();
				words.add(word);
				hm.put(newWord, words);
			}
		}
		for(String s : hm.keySet()) {
			ArrayList<String> pp = hm.get(s);
			if(pp.size() > 1)
				System.out.print(pp+" ");
		}
		
	}

}
