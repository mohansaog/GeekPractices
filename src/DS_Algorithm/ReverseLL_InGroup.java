package DS_Algorithm;

public class ReverseLL_InGroup {
	static Node head;
	static class Node {
		int data;
		Node next;
		Node(int d) {
			data= d;
		}
	}

	public static void main(String[] args) {
		ReverseLL_InGroup list = new ReverseLL_InGroup();
		int k = 3;
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);
		head = alternateReverse(head,k);
		printode(head);
	}

	private static void printode(Node head2) {
		Node temp = head2;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}

	private static Node alternateReverse(Node head2,int k) {
		Node curr = head2;
		Node prev = null;
		Node next = null;
		int i = 0;
		while(curr != null && i < k) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			i++;
		}
		if(next != null) {
			head2.next = alternateReverse(next, k);
		}
		return prev;
	}

}
