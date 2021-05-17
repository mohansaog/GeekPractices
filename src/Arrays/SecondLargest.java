package Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[] = {1,1,1,2,1};
		int a=0,b=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > a) {
				b=a;
				a = arr[i];
			}
			//in between a and b
			else if(arr[i] > b && arr[i] != a )
				b=arr[i];
		}
		if(b == 0)
			System.out.println("no second largest element");
		else
			System.out.println(b);
		
	}

}
