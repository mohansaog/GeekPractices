package Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class LargestElementFromaArray {

	public static void main(String[] args) {
		Integer arr[] = new Integer[]{3,6,4,5,6,10,55,33,22};
		Collection<Integer> cl = Arrays.asList(arr);
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		int p = Collections.max(cl);
		System.out.println(p);
		System.out.println(Collections.min(cl));
		System.out.println(min);
	}

}
