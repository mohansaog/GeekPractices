package mettle_hacker_rank_earth;

public class moveZerosRightSide {

	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,0,0,0,5,8,10,0};
		int n = arr.length;
		int count = 0;
		for(int i=0;i<n;i++) {
			if(arr[i] != 0)
				arr[count++] = arr[i];
			
		}
		for(int i = count;i<n;i++)
			arr[i] = 0;
		
		
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}

}
