package mettle_hacker_rank_earth;

import java.util.HashSet;

public class PairSumInArray {

	public static void main(String[] args) {
 		int[] arr = new int[] { 1,2,3,4,5 };
		int sum = 9;
		findPair(arr,sum);
	}

	private static void findPair(int[] arr, int sum) {
		int n=arr.length;
		HashSet<Integer> hs = new HashSet<Integer>();
		int temp;
		for(int i=0;i<n;i++) {
			temp = sum - arr[i];
			if(hs.contains(temp)) {
				System.out.println(arr[i]+" , "+temp);
			}
			hs.add(arr[i]);
		}
	}

}
