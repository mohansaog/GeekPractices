package Arrays;

import java.util.Iterator;
import java.util.PriorityQueue;

public class kthLargestElement {

	public static void main(String[] args) {
		
		int arr[] = {2,45,3,76,9,10,46,56,99};
		int k = 4;
		KthLargest(arr,arr.length,k);
	}

	private static void KthLargest(int[] arr, int length, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		int count = 0;
		for(int i=0;i<k;i++) {
			minHeap.add(arr[i]);
		}
		
		for(int j=k;j<length;j++) {
			 if(minHeap.peek() > arr[j]) 
				 continue;
			 else {
				 count++;
				 minHeap.poll();
				 minHeap.add(arr[j]);

			 }
		}
		/*
		 * if(count == k) System.out.println(count);
		 */Iterator iterator = minHeap.iterator();
		 minHeap.forEach(p-> {
			 System.out.println(p);
		 });
	     
	    while (iterator.hasNext()) 
	    { 
	        System.out.print(iterator.next() + " "); 
	    }
		
	}

}
