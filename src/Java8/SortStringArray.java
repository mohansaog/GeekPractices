package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStringArray {

	public static void main(String[] args) {
		List<String> names1 = new ArrayList<String>();
	      names1.add("Mahesh ");
	      names1.add("Suresh ");
	      names1.add("Ramesh ");
	      names1.add("Naresh ");
	      names1.add("Kalpesh ");
			
	      List<String> names2 = new ArrayList<String>();
	      names2.add("Mahesh ");
	      names2.add("Suresh ");
	      names2.add("Ramesh ");
	      names2.add("Naresh ");
	      names2.add("Kalpesh ");
	      
	      Collections.sort(names1,(s1,s2)-> s2.compareTo(s1)); // sorting reverse order
	      System.out.println(names1);
	}

}
