package Arrays;

import java.util.Arrays;

public class RemoveDuplicateFromArray_1 {

	public static void main(String[] args) {
		int arr[] = {1,1,1,3,3,4,5,6,6,6,7,7,7,8,8};
		Arrays.sort(arr);
		int n = arr.length;
		int temp[] = new int[n];
		int k=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i] != arr[i+1])
				temp[k++] = arr[i];
		}
		temp[k++] = arr[n-1];
		for(int i=0;i<k;i++) {
			arr[i] = temp[i];
			System.out.println(arr[i]);
		}
		//System.out.println(b);
	}

}
