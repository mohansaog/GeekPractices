package DS_Algorithm;

import java.util.HashSet;

import DS_Algorithm.ReverseLL_InGroup.Node;

public class DetectLoop {
	static Node head;
	static class Node {
		int data;
		Node next;
		Node(int d) {
			data= d;
		}
	}

	public static void main(String[] args) {
		DetectLoop list = new DetectLoop();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);
		list.head.next.next.next.next = head.next.next;
		boolean isTrue = findloop1(head);
		if(isTrue)
			System.out.println("funn");
		else
			System.out.println("bhag");
	}

	private static boolean findloop1(Node head2) {
		HashSet<Node> hs = new HashSet<Node>();
		while(head2 != null) {
			if(hs.contains(head2)) {
				System.out.println(head2.data);
				return true;
			}
				
			hs.add(head2);
			head2 = head2.next;
		}
		return false;
	}

	private static boolean findloop(Node head2) {
		Node first = head2;
		Node second = head2.next;
		while(first != null && second!= null && second.next != null) {
			if(first == second)
				return true;
			first = first.next;
			second = second.next.next;
		}
		return false;
	}

}
