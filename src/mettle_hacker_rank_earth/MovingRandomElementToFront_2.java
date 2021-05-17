package mettle_hacker_rank_earth;

public class MovingRandomElementToFront_2 {

	public static void main(String[] args) {
		int arr[] = {33,55,43,23,43,4,5,6,4};
		int find = 5;
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == find)
				index = i;
		}
		for(int i= index;i>=1;i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = 5;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
