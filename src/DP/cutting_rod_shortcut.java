package DP;

public class cutting_rod_shortcut {

	public static void main(String args[]) {
		int arr[] = new int[] { 0, 3, 5, 6, 15, 10, 25, 12, 24 };
		int size = arr.length;
		System.out.println("Maximum Obtainable Value is " + cutRod(arr, size));
	}

	static int cutRod(int price[], int n) {
		int val[] = new int[n + 1];
		val[0] = 0;

		for (int i = 1; i <= n; i++) {
			int max_val = Integer.MIN_VALUE;
			for (int j = 0; j < i; j++)
				max_val = Math.max(max_val, price[j] + val[i - j - 1]);
			val[i] = max_val;
		}

		return val[n];
	}

}
