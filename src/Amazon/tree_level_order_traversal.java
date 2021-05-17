package Amazon;

class Node {
	int data;
	Node left,right;
	public Node(int item) {
		data = item;
		left = null;
		right = null;
	}
}
public class tree_level_order_traversal {
	
	Node root;
	void PrintLevelOrder() {
		
	}
	public static void main(String[] args) {
		tree_level_order_traversal tree = new tree_level_order_traversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
	}

}
