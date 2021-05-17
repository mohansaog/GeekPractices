package mettle_hacker_rank_earth;

public class MoveZerosLeftSide_1 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,40,0,54,0,6};
		int count = 0;
		int zeroCount = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0)
				arr[count++] = arr[i];
			else
				zeroCount++;
		}
		for(int i = 0;i<zeroCount;i++) {
			arr[count++] = 0;
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
