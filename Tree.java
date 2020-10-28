package tree;

public class Tree {

	public TreeNode root;

	public void insert(TreeNode z) {
		
		TreeNode x,y;
		
		y = null;
		x = root;

		while (x != null) {

			y = x;
			if (z.getData() <= x.getData()) {
				x = x.getLeftChild();
			} else
				x = x.getRightChild();

		}

		z.setParent(y);

		if (y == null) {
			root = z;
		}

		else if (z.getData() <= y.getData()) {
			y.setLeftChild(z);
		} else
			y.setRightChild(z);
	}

	public void inorderTraversal(TreeNode x) {

		if (x != null) {
			inorderTraversal(x.getLeftChild());
			System.out.println(x.getData());
			inorderTraversal(x.getRightChild());
		}
	}

	public TreeNode successor(TreeNode x) {

		if (x.getRightChild() != null) {
			return minimum(x.getRightChild());
		}

		TreeNode y = x.getParent();

		while (y != null && x == y.getRightChild()) {
			x = y;
			y = y.getParent();
		}
		return y;
	}

	public TreeNode search(TreeNode x, int key) {

		if (x == null || x.getData() == key) {
			return x;
		}

		if (key < x.getData()) {
			return search(x.getLeftChild(), key);
		} else
			return search(x.getRightChild(), key);
	}

	private void transplant(TreeNode u, TreeNode v) {

		if (u.getParent() == null) {
			this.root = v;
		}

		else if (u.getParent().getLeftChild() == u) {
			u.getParent().setLeftChild(v);
		} else
			u.getParent().setRightChild(v);

		if (v != null) {
			v.setParent(u.getParent());
		}

	}

	public void delete(TreeNode z) {

		if (z.getLeftChild() == null) {
			transplant(z, z.getRightChild());
		} else if (z.getRightChild() == null) {
			transplant(z, z.getLeftChild());
		} else {
			TreeNode y = minimum(z.getRightChild());

			if (y.getParent() != z) {
				transplant(y,y.getRightChild());
				y.setRightChild(z.getRightChild());
				y.getRightChild().setParent(y);
			}
			transplant(z,y);
			y.setLeftChild(z.getLeftChild());
			y.getLeftChild().setParent(y);
		}
	}

	public TreeNode minimum(TreeNode x) {

		while (x.getLeftChild() != null) {
			x = x.getLeftChild();
		}

		return x;
	}

	public TreeNode maximum(TreeNode x) {

		while (x.getRightChild() != null) {
			x = x.getRightChild();
		}

		return x;
	}

}
