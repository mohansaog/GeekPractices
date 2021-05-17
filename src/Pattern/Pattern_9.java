package Pattern;

import java.util.Scanner;

//Pattern - 5 pepcoding
public class Pattern_9 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int os = 1; // outer space
		// better to see the pattertn_7_2.java and pattern_8
		// it wil be helpful
		for(int i=1;i<=n;i++) {
		
			for(int j=1;j<=n;j++) {
				if(i==j || i+j == n+1) {
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

}
