package Pattern;

import java.util.Scanner;

//Pattern - 2 pepcoding
public class Pattern_2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=n;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print("*\t");
			}
			System.out.println();
		}
	}

}
