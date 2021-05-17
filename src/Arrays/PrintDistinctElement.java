package Arrays;

import java.util.HashSet;

public class PrintDistinctElement {

	/*
	 * public static void main(String[] args) { int array[] = { 2, 4, 66, 5, 4, 8,
	 * 7, 8, 10 }; Hashtable<Integer, Integer> hm = new Hashtable<Integer,
	 * Integer>(); for (int i = 0; i < array.length; i++) { hm.put(array[i], i); }
	 * 
	 * System.out.println(hm.keySet()); System.out.println(hm.values()); }
	 */
	public static void main(String[] args) {
		int array[] = { 2, 4, 66, 5, 4, 8, 7, 8, 10 };
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (!set.contains(array[i])) {
				set.add(array[i]);
				System.out.println(array[i] + " ");
			}
		}
		System.out.println(set);
	}
}
