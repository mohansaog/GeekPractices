package Pattern;

import java.util.Scanner;

//Pattern - 5 pepcoding
public class Pattern_5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int os = n/2; // outer space
		int star = 1; //inner space
		
		for(int i=1;i<=n;i++) {
		
			for(int j=os;j>=1;j--) {
				System.out.print("\t");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*\t");
			}
			if(i <= (n/2)) {
				os--;
				star += 2;
			}
			else {
				os++;
				star -= 2;
			}
			System.out.println();
		}
	}

}
