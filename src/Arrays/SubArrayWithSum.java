package Arrays;

public class SubArrayWithSum {

	public static void main(String[] args) {
		int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
		int sum = 24;
		SubaArrayWithIndex(arr,sum);

	}

	private static void SubaArrayWithIndex(int[] arr,int sum) {
		
		int curr_sum = arr[0];
		int i;
		int start=0;
		for( i=1;i<=arr.length;i++) {
			while(curr_sum > sum && start < i-1) {
				curr_sum = curr_sum - arr[start];
				start++;
			}
			if(curr_sum == sum) {
				System.out.println(start + "  "+(i-1));
			}
			if(i < arr.length)
				curr_sum = curr_sum + arr[i];
			
			
		}
		
	}

}
