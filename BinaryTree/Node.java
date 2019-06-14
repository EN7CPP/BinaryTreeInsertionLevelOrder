
public class Node {

	private int data;
	private String name;
	public Node leftChild;
	public Node rightChild;
	
	public Node(int d,String n) {
		this.data=d;
		this.name=n;
	}
	
	public boolean isRightNull() {
		if(this.rightChild==null) {
			return true;
		}
		else return false;
	}
	
	
	public boolean isLeftNull() {
		if(this.leftChild==null) {
			return true;
		}
		else return false;
	}
	
	
	public int getData() {
		return this.data;
	}
	
	
	
	
}
