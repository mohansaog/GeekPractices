package Arrays;

import java.util.Scanner;

public class SubsetOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<(1 << arr.length);i++) {
			for(int j=0;j<arr.length;j++) {
				if((i &(1 << j)) > 0){
					System.out.print(arr[j]+ " ");
				}
			}
			System.out.println("\n");
		}

	}

}
