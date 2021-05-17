package Amazon;

import java.util.ArrayList;

public class PermutationOfString {

	public static void main(String[] args) {
		String str = "aab";
		permutation(str);
		
	}

	private static void permutation(String str) {
		int r = str.length()-1;
		int l = 0;
		permutationOnnce(str,l,r);
		
	}

	private static void permutationOnnce(String str, int l, int r) {
		ArrayList<String> arr = new ArrayList<String>();
		if(l == r) {
			System.out.println(str);
			arr.add(str);
		}
		else
		{
			for(int i=l;i<=r;i++) {
				str = swap(str,l,i);
				permutationOnnce(str, l+1, r);
				str = swap(str,l,i);
			}
		}
	}

	private static String swap(String str, int l, int i) {
		char[] newChar = str.toCharArray();
		char temp = newChar[l];
		newChar[l] = newChar[i];
		newChar[i] = temp;
		return String.valueOf(newChar);
	}

}
