package Array_2D;

import java.util.Scanner;

public class SpiralDisplay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int rmin = 0;
		int cmin = 0;
		int rmax = arr.length -1;
		int cmax = arr[0].length-1;
		int counter = 1;
		int tnc = arr.length * arr[0].length;
		
		while(counter <= tnc) {
			
			//left wall
			for(int i=rmin;i<=rmax && counter <= tnc;i++) {	// && counter <= tnc ---> to check the counter in every stage
				System.out.print(arr[i][cmin]+" ");
				counter++;
			}
			cmin++;
			
			//bottom wall
			for(int j=cmin;j<=cmax && counter <= tnc;j++) {
				System.out.print(arr[rmax][j]+" ");
				counter++;
			}
			rmax--;
			
			//right wall
			for(int i = rmax;i>=rmin && counter <= tnc;i--) {
				System.out.print(arr[i][cmax]+" ");
				counter++;
			}
			cmax--;
			
			//top wall
			for(int j=cmax;j>=cmin && counter <= tnc;j--) {
				System.out.print(arr[rmin][j]+" ");
				counter++;
			}
			rmin++;
		}
	}

}
