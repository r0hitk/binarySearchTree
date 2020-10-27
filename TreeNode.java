package tree;

public class TreeNode {

	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	private TreeNode parent;

	public TreeNode(int data) {
		this.data = data;
		this.leftChild = null;
		this.rightChild = null;
		this.parent = null;
	}

	public int getData() {
		return data;
	}

	/*
	 * public void setData(int data) { this.data = data; }
	 */

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public void setParent(TreeNode y) {
		parent = y;
	}

	public TreeNode getParent() {
		return parent;
	}

}
