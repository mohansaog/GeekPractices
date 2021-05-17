package Arrays;

public class ShiftZeroToLast {

	public static void main(String[] args) {
		Integer arr[] = new Integer[]{2,3,5,0,6,0,5,0,10};
		int n = arr.length;
		int k = 0,count = 0;
		for(int i=0;i<n;i++) {
			if(arr[i] != 0) {
				arr[k++] = arr[i];
			}
			else
				count++;
		}
		while(count>0) {
			arr[k++] = 0;
			count--;
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
