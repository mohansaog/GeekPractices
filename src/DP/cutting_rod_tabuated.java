package DP;

public class cutting_rod_tabuated {

	public static void main(String[] args) {

		int[] arr = { 0,3,5,6,15,10,25,12,24 };
		int[] strg = new int[arr.length];
		String[] path = new String[arr.length];

		strg[0] = 0;
		strg[1] = arr[1];
		path[0] = "";
		path[1] = "1";

		for (int i = 2; i < arr.length; i++) {
			strg[i] = arr[i];
			path[i] = i + "";
			int left = 1;
			int right = i - 1;

			while (left <= right) {
				if (strg[left] + strg[right] > strg[i]) {
					strg[i] = strg[left] + strg[right];
					path[i] = path[left] + path[right];
				}
				left++;
				right--;
			}
		}
		System.out.println(strg[arr.length - 1]);
		System.out.println(path[arr.length - 1]);

	}

}
