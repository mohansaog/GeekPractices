package Array_2D;

public class Rotate90Degree {

	public static void main(String[] args) {
		int arr[][] = {
				{11,12,13,14},
				{21,22,23,24},
				{31,32,33,34},
				{41,42,43,44}
		};
		
		int n = arr.length;
		for(int i=0;i<n/2;i++) {
			for(int j=i;j<(n-1)-i;j++) {
				//swap each element of each cycle and in clockwise direction as well
				int temp = arr[i][j];
				arr[i][j] = arr[(n-1)-j][i];
				arr[(n-1)-j][i] = arr[(n-1)-i][(n-1)-j];
				arr[(n-1)-i][(n-1)-j] = arr[j][(n-1)-i];
				arr[j][(n-1)-i] = temp;
			}
		}
		for (int i = 0; i < n; i++) 
	    { 
	        for (int j = 0; j < n; j++) 
	        System.out.print( arr[i][j] + " "); 
	        System.out.println(); 
	    } 
	}

}
