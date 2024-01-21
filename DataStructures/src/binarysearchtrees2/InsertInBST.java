package binarysearchtrees2;

import binaytrees2.BinaryTreeNode;

public class InsertInBST {
	

	  public static BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> node, int x){
	        if(node==null){
	            BinaryTreeNode<Integer> newRoot= new BinaryTreeNode<Integer>(x);
	            return newRoot;
	        }
	        if(x>=node.data){
	          node.right= insert(node.right,x);
	        }
	        else{
	          node.left= insert(node.left,x);
	        }
	        return node;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
