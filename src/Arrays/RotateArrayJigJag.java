package Arrays;

public class RotateArrayJigJag {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 1, 1, 2, 2, 5, 5, 7, 7, 8, 8, 9 };
		int n = arr.length;
		int kth = 3;

		leftRotate(arr, kth, n);

	}

	private static void leftRotate(int[] arr, int kth, int n) {
		kth = kth % n;
		int g_c_d = gcd(kth, n);
		int i, j, k, temp;
		for (i = 0; i < g_c_d; i++) {
			temp = arr[i];
			j = i;
			while (true) {
				k = j + kth;
				if (k >= n)
					k = k - n;
				if (k == i)
					break;
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	private static int gcd(int kth, int n) {
		if (n == 0)
			return kth;
		else
			return gcd(n, kth % n);
	}

}
