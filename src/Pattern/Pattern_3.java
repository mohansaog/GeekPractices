package Pattern;

import java.util.Scanner;

//Pattern - 2 pepcoding
public class Pattern_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int os = n-1;
		for(int i=1;i<=n;i++) {
			
			for(int j=os;j>=1;j--) {
				System.out.print("\t");
			}
			os--;
			for(int j=1;j<=i;j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
	}

}
