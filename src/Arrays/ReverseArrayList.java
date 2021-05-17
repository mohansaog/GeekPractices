package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(10);
		list.add(4);
		list.add(7);
		list.add(34);
		// 5 10 4 7 34
		int i = 0;
		int j = list.size() - 1;
		while (i < j) {
			Integer temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
			i++;j--;
		}
		System.out.println(list);

	}

}
