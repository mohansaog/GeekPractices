package Amazon;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] arr = {3,4,5,1,6};
		int n = arr.length;
		int m = n+1;
		m = (m*(m+1))/2;
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum = sum+arr[i];
		}
		System.out.println(m-sum);
				
	}

}
