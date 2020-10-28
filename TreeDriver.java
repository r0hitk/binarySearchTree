package tree;

public class TreeDriver {

	public static void main(String[] args) {

		Tree intTree = new Tree();
		//Tree diffTree = new Tree();

		TreeNode firstNode = new TreeNode(12);
		TreeNode secondNode = new TreeNode(35);
		TreeNode thirdNode = new TreeNode(11);
		TreeNode fourthNode = new TreeNode(11);
		TreeNode fifthNode = new TreeNode(5);

		/*TreeNode one = new TreeNode(22);
		TreeNode two = new TreeNode(10);
		*/
		intTree.insert(firstNode);
		intTree.insert(secondNode);
		intTree.insert(thirdNode);
		intTree.insert(fourthNode);
		intTree.insert(fifthNode);

	/*	TreeNode three = new TreeNode(14);
		
		diffTree.insert(one);
		diffTree.insert(two);
		diffTree.insert(three);*/
		
		intTree.inorderTraversal(intTree.root);
		System.out.println();
		//diffTree.inorderTraversal(diffTree.root);
		
		System.out.println();
		System.out.println(intTree.minimum(intTree.root).getData());
		System.out.println(intTree.maximum(intTree.root).getData());
		
		//intTree.search(intTree.root, 24).getData();
		System.out.println(intTree.search(intTree.root, 11));
		System.out.println();
		
		
		//search for a node with the given value and find its successor
		System.out.println(intTree.successor(intTree.search(intTree.root, 11)).getData());
		
		//delete a node
		intTree.delete(intTree.search(intTree.root, 11));
		System.out.println();
		intTree.inorderTraversal(intTree.root);
		System.out.println();
		
		//delete the root node
		intTree.delete(intTree.search(intTree.root, 12));
		intTree.inorderTraversal(intTree.root);
		System.out.println();
		
		//root is now changed
		System.out.println(intTree.root.getData());
	}

}
