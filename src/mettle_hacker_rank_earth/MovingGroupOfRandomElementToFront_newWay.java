package mettle_hacker_rank_earth;

public class MovingGroupOfRandomElementToFront_newWay {
	public static void main(String[] args) {
		int arr[] = {3,4,5,6,6,7,8,0}; // 6 6 7 8 0 3 4 5
		// 0 8 7 6 6 5 4 3 reverse
		// 
		//
		int k = 3;
		arr = reverse(arr,0,arr.length);
		arr = reverse(arr,0,arr.length-k);
		arr = reverse(arr,arr.length-k,arr.length);
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
	}
	public static int[] reverse(int arr[],int start,int end)
	{
		int i = start , j = end-1;
		
		while(i < j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return arr;
	}
}
