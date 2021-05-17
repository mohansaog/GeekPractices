package Pattern;

import java.util.Scanner;

//Pattern - 2 pepcoding
public class Pattern_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int os = 0;
		for (int i = n; i >= 1; i--) {

			for (int j = 1; j <= os; j++) {
				System.out.print("\t");
			}
			os++;
			for (int j = i; j >= 1; j--) {
				System.out.print("*\t");
			}

			System.out.println();
		}
	}

}
