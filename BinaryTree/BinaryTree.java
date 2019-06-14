import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	private Queue <Node> q=new LinkedList<>();
	private Node root;
	
	public BinaryTree(Node r) {
		this.root=r;
		q.add(r);
	}
	
	public void addNode(Node toBeAdded) {
		Node current=q.peek();
		if(current.isLeftNull()) {
			current.leftChild=toBeAdded;
			q.add(toBeAdded);
		}
		else {
			current.rightChild=toBeAdded;
			q.add(toBeAdded);
			q.poll();
		}
	}
	public void printTree() {
		printLeafNodes(this.root);
	}
	
	public void printLeafNodes(Node n) {
		if(n==null) {
			return;
		}
		if(n.isLeftNull()&&n.isRightNull()) {
			System.out.println(n.getData());
		}
		
		printLeafNodes(n.leftChild);
		printLeafNodes(n.rightChild);
		
	}
	
	
	
	
	
}
