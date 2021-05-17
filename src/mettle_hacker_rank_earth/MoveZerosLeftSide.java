package mettle_hacker_rank_earth;

public class MoveZerosLeftSide {

	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,0,0,0,5,8,10,0};
		int n = arr.length-1;
		int count = n;
		for(int i=n;i>=0;i--) {
			if(arr[i] != 0)
				arr[count--] = arr[i];
			
		}
		for(int i = count;i>=0;i--)
			arr[i] = 0;
		
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}

}
