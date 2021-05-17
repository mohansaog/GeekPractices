package TCS;

import java.util.HashMap;
import java.util.HashSet;

public class vowelWala {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		int[] arr = {7,4,2};
		hm.put(1, "one");
		hm.put(0, "zero");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");
		hm.put(5, "five");
		hm.put(6, "six");
		hm.put(7, "seven");
		
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(arr[i])) {
				count = count + getCountVal(hm.get(arr[i]));
			}
		}
		System.out.println(count);
		int getCount = findAll(arr,count);
		if(hm.containsKey(getCount))
			System.out.println(hm.get(getCount));
	}

	private static int findAll(int[] arr, int sum) {
		HashSet<Integer> hs = new HashSet<Integer>();
		int temp;
		int sume = 0;
		int n = arr.length;
		for(int i = 0;i<n;i++) {
			temp = sum - arr[i];
			if(hs.contains(temp)) {
				++sume;
			}
			hs.add(arr[i]);
		}
		return sume;
	}

	private static int getCountVal(String str) {
		int sum = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				sum = sum+1;
			}
		}
		return sum;
	}

}
