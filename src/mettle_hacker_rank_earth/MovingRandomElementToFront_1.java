package mettle_hacker_rank_earth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovingRandomElementToFront_1 {

	public static void main(String[] args) {
		int[] arr = {3,4,5,6,7,8};
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		int n = list.size();
		int i;
		int p = 0;
		for(i = 0;i<n;i++) {
			if(list.get(i) == 6) {
				p = list.get(i);
				break;
			}
		}
		
		System.out.println(i);
		int count = i;
		for(int j=count;j>0;j--) {
			list.set(j,list.get(j-1));
		}
		list.set(0, p);
		System.out.print(list);
	}

}
