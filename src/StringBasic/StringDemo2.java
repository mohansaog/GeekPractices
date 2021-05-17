package StringBasic;

import java.util.Scanner;

public class StringDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printString(str);
	}

	private static void printString(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
	}

}
