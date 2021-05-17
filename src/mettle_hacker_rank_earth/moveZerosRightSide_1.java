package mettle_hacker_rank_earth;

public class moveZerosRightSide_1 {

	public static void main(String[] args) {
		int arr[] = {3,4,0,0,1,20,0,56,55};
		int count = arr.length - 1;
		int zeroCount = 0;
		for(int i=arr.length - 1;i>=0;i--) {
			if(arr[i] != 0)
				arr[count--] = arr[i];
			else
				zeroCount++;
		}
		for(int i = 0;i<zeroCount;i++) {
			arr[i] = 0;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
