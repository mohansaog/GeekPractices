package Queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueExample_2 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(5,Collections.reverseOrder());
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			pq.add(sc.nextInt());
		}
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(pq.peek());
		pq.remove();
		System.out.println(pq.peek());
	}

}
