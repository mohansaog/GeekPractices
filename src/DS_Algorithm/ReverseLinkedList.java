package DS_Algorithm;

public class ReverseLinkedList {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new Node(50);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);
		head = reverse(head);
		printNode(head);
	}

	private static void printNode(Node head2) {
		while (head2 != null) {
			System.out.println(head2.data);
			head2 = head2.next;
		}

	}

	private static Node reverse(Node head) {
		Node curr = null, prev = null;
		Node next = null;
		curr = head;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		return prev;
	}

}
