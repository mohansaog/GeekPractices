package testing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test4 {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1 };
		int max1 = 0;
		int max2 = 0;
		int count = 0;
		
		List<Integer> list = Arrays.asList(3,2,1);
		list = list.stream().distinct().collect(Collectors.toList());

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max1 ) {
				max2 = max1;
				max1 = list.get(i);
			} else if (list.get(i) > max2 && list.get(i) != max1) {
				max2 = list.get(i);
			}
		}
		if (list.size() == 1)
			return;
		else if (count != 1)
			System.out.println(max2);
		else
			System.out.println("no second largest element");

	}

}
