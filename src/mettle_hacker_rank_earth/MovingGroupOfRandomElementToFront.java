package mettle_hacker_rank_earth;

public class MovingGroupOfRandomElementToFront {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		//7 8 9 1 2 3 4 5 6
		int k = 3;
		int n1 = arr.length -k;
		int[] newArr = new int[arr.length];
		int count = 0;
		for(int i=n1;i<arr.length;i++) {
			newArr[count++] = arr[i];
		}
		for(int i=0;i<n1;i++) {
			newArr[count++] = arr[i];
		}
		for(int i=0;i<newArr.length;i++) {
			System.out.print(newArr[i]+" ");
		}
	}

}
