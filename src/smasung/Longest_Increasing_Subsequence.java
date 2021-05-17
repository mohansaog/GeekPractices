package smasung;

public class Longest_Increasing_Subsequence {

	public static void main(String[] args) {

		int arr[] = {50, 3, 10, 7, 40, 80};
		int n = arr.length;
		int a = Integer.MIN_VALUE;
		int count = 0;
		for(int i=0;i<n;i++) {
			if(arr[i] > a) {
				a = arr[i];
				count++;
			}
		}
		System.out.println(count);
	}

}
