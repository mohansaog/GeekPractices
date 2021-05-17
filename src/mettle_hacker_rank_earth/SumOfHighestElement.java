package mettle_hacker_rank_earth;

import java.util.Arrays;
import java.util.Collections;

public class SumOfHighestElement {

	public static void main(String[] args) {
		Integer[] arr = {3,31,5,6,7,17};
		int n = arr.length;
		int kthSum = 3;
		int sum = 0;
		Arrays.sort(arr,Collections.reverseOrder());
		for(int i=0;i<kthSum;i++)
			sum = sum+arr[i];
			System.out.println(sum);
	}

}
