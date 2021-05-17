  package Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int arr1[] = new int[] { 4, 6, 8, 9, 13 };
		int arr2[] = new int[] { 3, 7, 11, 15, 17, 18, 22 };
		int n = arr1.length + arr2.length;
		int arr3[] = new int[n];
		MergeNsort(arr1, arr2, arr3, n);

	}

	private static void MergeNsort(int[] arr1, int[] arr2, int[] arr3, int n) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		int i = 0, j = 0;
		int k = 0;
		while (i < n1 && j < n2) {
			if (arr1[i] < arr2[j])
				arr3[k++] = arr1[i++];
			else
				arr3[k++] = arr2[j++];
		}
		while (i < n1)
			arr3[k++] = arr1[i++];
		while (j < n2)
			arr3[k++] = arr2[j++];
		for (int p = 0; p < n; p++) {
			System.out.print(arr3[p] + " ");
		}
	}

}
