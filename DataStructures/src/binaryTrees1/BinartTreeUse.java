package binaryTrees1;

public class BinartTreeUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);

	        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
	        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
	        root.left = rootLeft;
	        root.right= rootRight;

	        BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);
	        BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);

	        rootLeft.right= twoRight;
	        rootRight.left= threeLeft;

	}

}
