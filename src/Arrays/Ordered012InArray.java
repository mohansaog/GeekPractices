package Arrays;

public class Ordered012InArray {

	public static void main(String[] args) {
		int arr[] = {1,2,0,0,0,0,1,2,1,2,0};
		int n = arr.length;
		Segregate(arr,n);
	}

	private static void Segregate(int[] arr, int n) {
		int count = 0;
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		for(int i=0;i<n;i++) {
			switch (arr[i]) {
			case 0:
				count0++;
				break;
			case 1 :
				count1++;
				break;
			case 2 :
				count2++;
				break;
				
			default:
				break;
			}
		}
			
			while(count0 > 0) {
				arr[count++] = 0;
				count0--;
			}
			while(count1 > 0) {
				arr[count++] = 1;
				count1--;
			}
			while(count2 > 0) {
				arr[count++] = 2;
				count2--;
			}
			
			for(int i =0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
	}

}
