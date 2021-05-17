package StringBasic;

import java.util.Scanner;

public class StringBuilderDemo {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("mohan");
		sb.setCharAt(4, 'b'); //only add on index
		sb.append('a');	//only add on end
		System.out.println(sb);
	}
}
