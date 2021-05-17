package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseQueue {

	
	public static void reverseQueue(Queue<Integer> q) {
		int n = q.size();
		Stack<Integer> stack = new Stack<Integer>();
		for(int i =0; i< n;i++) {
		stack.push(q.peek());
		q.remove();
		}
		for(int i =0; i< n;i++) {
			q.add(stack.peek());
			stack.pop();
		}
		System.out.println(q);
	}
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			queue.add(sc.nextInt());
		}
		reverseQueue(queue);
		//System.out.println(queue);

	}

}
