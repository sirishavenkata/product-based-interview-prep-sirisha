package Recursion;

class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		this.data=data;
		left=null;
		right=null;
	}
}
public class DFSRecursion {
	
	Node root;
	
	private void preOrder(Node data) {
		if(data == null) {
			return;
		
		}
		System.out.println("preOrder");
	System.out.println(data.data);
	preOrder(data.left);
	preOrder(data.right);
	}
	
	private void inOrder(Node data) {
		if(data == null) {
			return;
		}
		System.out.println("InOrder");
		inOrder(data.left);
		System.out.println(data.data);
		inOrder(data.right);
		
		
	}
	private void postOrder(Node data) {
		if(data == null) {
			return;
		}
		System.out.println("postOrder");
		postOrder(data.left);
		postOrder(data.right);
		System.out.println(data.data);
	}
	
	public void preordertraversal() {
		DFSRecursion recur=new DFSRecursion();
		recur.preOrder(root);
		System.out.println(root.data);
	}
	public void inordertraversal() {
		DFSRecursion recur=new DFSRecursion();
		recur.inOrder(root);
		System.out.println(root.data);
	}
	public void postordertraversal() {
		DFSRecursion recur=new DFSRecursion();
		recur.postOrder(root);
		System.out.println(root.data);
	}
	
	public static void main(String[] args) {
		DFSRecursion recur=new DFSRecursion();
		recur.root=new Node(4);
		recur.root.left=new Node(2);
		recur.root.right =new Node(6);
		recur.root.left.left=new Node(1);
		recur.root.left.right=new Node(3);
		recur.root.right.left=new Node(5);
		recur.root.right.right=new Node(7);
		
		recur.preordertraversal();
		recur.inordertraversal();
		recur.postordertraversal();
		
	}

}

