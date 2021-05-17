package DS_Algorithm;

public class ReverseLL_1 {
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
		ReverseLL_1 list = new ReverseLL_1();
		list.head = new Node(50);
		list.head.next= new Node(51);
		list.head.next.next = new Node(31);
		list.head.next.next.next = new Node(29);
		head = reverseList(head);
		printIt(head);
	}

	private static void printIt(Node head2) {
		Node temp = head2;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
			
		}
	}

	private static Node reverseList(Node head2) {
		Node curr = null;
		Node prev = null;
		Node next = null;
		curr = head;
		while(curr != null) {
			next= curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			
		}
		
		return prev;
	}

}
