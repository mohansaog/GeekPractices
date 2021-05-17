package Arrays;

public class ThirdLargestElement {

	public static void main(String[] args) {
		int arr[] = {6,7,9,45,67,23};
		int a=0,b=0,c=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > a) {
				c=b;
				b=a;
				a=arr[i];
			}
			else if(arr[i] > b && arr[i] != a) {
				b=c;
				b=arr[i];
			}
			else if(arr[i] != b)
				c= arr[i];
	}
		System.out.println(c);

}
}
