package mettle_hacker_rank_earth;

public class MovingRandomElementToFront {

	public static void main(String[] args) {
		int[] arr = {3,4,5,6,7,8};
		int n = arr.length;
		int count = 3;
		int acVallue = 6;
		for(int i=count;i>=1;i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = 6;
		for(int i=0;i<n  ;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	/*
	 * public static void swapFirstAndSecondHalf(int[] values) {
    final int len = values.length / 2;
    final int offset = values.length - len;
    for (int i = 0; i < len; i++) {
        int temp = values[i];
        values[i] = values[offset + i];
        values[offset + i] = temp;
    }
}*/

}
