package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
public class RemoveDuplicateFromArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>(Arrays.asList(5,50,5,50,50,34,14,14));
		ArrayList<Integer> blist = new ArrayList<Integer>();

		for(Integer pp : alist) {
			if(!blist.contains(pp)) {
				blist.add(pp);
			}
		}
		System.out.println(blist);
		
		}
}
