package binaryTrees1;

public class BinaryTreeRecursively1 {
	
	
	  public static void printTree(BinaryTreeNode<Integer> root){
	        if(root == null){
	            return;
	        }
	        System.out.println(root.data);
	        printTree(root.left);
	        printTree(root.right);

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);

	        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
	        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
	        root.left = rootLeft;
	        root.right= rootRight;

	        printTree(root);

	}

}
