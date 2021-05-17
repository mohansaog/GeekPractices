package Arrays;

public class RotateArray {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6,1,2 };
		int n = arr.length;
		int k = 3;

		k = k % n;
		// RightRotate(arr,n,k);
		for(int i=0;i<n;i++) {
			if (i < k) {
				System.out.print(arr[n + i - k]+" ");
			}
				
			else {
				System.out.print(arr[i - k]+" ");
			}
				
		}

		/*
		 * for (int i = 0; i < n; i++) { if (i < k) arr[i] = arr[n + i - k]; else arr[i]
		 * = arr[i - k]; } for (int p : arr) { System.out.print(p + " "); }
		 */

	}

}
