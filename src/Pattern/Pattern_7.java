package Pattern;

import java.util.Scanner;

//Pattern - 5 pepcoding
public class Pattern_7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int os = 1; // outer space
		for(int i=1;i<=n;i++) {
		
			for(int j=1;j<=os;j++) {
				System.out.print("\t");
			}
			System.out.print("*\t");
			os++;
			System.out.println();
		}
	}

}
