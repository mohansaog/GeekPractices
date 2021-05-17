package Arrays;

import java.util.Scanner;

public class SubsetOfArray_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		callFunction(arr);
	}

	private static void callFunction(int[] arr) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i;k <= j; k++) {
					sb.append(arr[k]+" ");
				}
				sb.append("\n");
			}
		}
		System.out.println(sb);
		
	}

}
