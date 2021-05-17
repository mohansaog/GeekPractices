package testing;

import java.util.PriorityQueue;

public class kthlargest {

	public static void main(String[] args) {
		int[] arr = {2,4,3,6,99,7,55,67,87,34};
		int k=4;
		findkth(arr,k);
		
	}

	private static void findkth(int[] arr, int k) {
		int n = arr.length;
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		for(int i=0;i<k;i++) {
			minHeap.add(arr[i]);
		}
		for(int j=k;j<n;j++) {
			if(minHeap.peek() > arr[j]) {
				continue;
			}
			else {
				minHeap.poll();
				minHeap.add(arr[j]);
			}
		}
		int max = 1000;
		for(Integer p: minHeap) {
			if(p < max) {
				max = p;
			}
		}
		System.out.println(max);
	}

}
