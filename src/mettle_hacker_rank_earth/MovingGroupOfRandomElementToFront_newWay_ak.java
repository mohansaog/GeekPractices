package mettle_hacker_rank_earth;

public class MovingGroupOfRandomElementToFront_newWay_ak {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8};
		int k= 4;
		arr = reverseIt(arr,0,arr.length);
		arr = reverseIt(arr, 0, k);
		arr = reverseIt(arr, k, arr.length);
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

	private static int[] reverseIt(int[] arr, int ii, int length) {
		int i = ii,j = length - 1;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;j--;
		}
		return arr;
	}

}
