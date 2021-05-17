package Arrays;

public class ThirdLargestElement2 {

	public static void main(String[] args) {
		int arr[] = {5,1,56,6,15,12};
		findKthLargestElement(arr);
	}

	private static void findKthLargestElement(int[] arr) {
		int n = arr.length;
		int first=arr[0];
		int second=0,third=0;
		for(int i=0;i<n;i++) {
			if(arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			}
			else if(arr[i] > second) {
				second = first;
				second = arr[i];
			}
			else
				third = arr[i];
		}
	
		System.out.println(third);
	}
}
