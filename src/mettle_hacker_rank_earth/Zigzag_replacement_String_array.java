package mettle_hacker_rank_earth;

public class Zigzag_replacement_String_array {

	public static void main(String[] args) {
		String str = "the big cat jumped over the lazy dog";
		// o/p-> god eht yzal gib eht tac revo depmuj
		String[] strArr = str.split(" ");
		int n = strArr.length;
		String[] strArrDup = new String[n];

		int p = 0, q = n - 1;
		int count = 0;
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = reverseString(strArr[i]);
		}

		while (p < q) {
			strArrDup[count++] = strArr[q];
			strArrDup[count++] = strArr[p];
			p++;
			q--;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(strArrDup[i] + " ");
		}
	}

	private static String reverseString(String string) {
		StringBuilder sb = new StringBuilder(string);
		sb.reverse();
		return sb.toString();
	}

}
