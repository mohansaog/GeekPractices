package DP;

public class cutting_rod_memorized {

	public static void main(String[] args) {

		int[] arr = { 0, 3, 5, 6, 15, 10, 25, 12, 24 };
		int m = rcm(arr, arr.length - 1, new int[arr.length]);
		System.out.println(m);
	}

	public static int rcm(int[] arr, int r1, int[] qb) {
		if (r1 == 0)
			return 0;
		if (qb[r1] != 0)
			return qb[r1];
		int msp = arr[r1];
		int left = 1;
		int right = r1 - 1;
		while (left <= right) {

			int mspl = rcm(arr, left, qb);
			int mspr = rcm(arr, right, qb);
			if (mspl + mspr > msp) {
				msp = mspl + mspr;
			}
			left++;
			right--;
		}
		qb[r1] = msp;
		return msp;
	}

}
