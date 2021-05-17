package testing;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDupUsingArralist {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,6,6,65));
		ArrayList<Integer> blist = new ArrayList<Integer>();
		alist.forEach(pp-> {
			if(!blist.contains(pp))
				blist.add(pp);
		});
		blist.forEach(k-> {
			System.out.println(k);
		});
	}

}
