package binaytrees2;

import java.util.Scanner;

import binaryTrees1.BinaryTreeNode;

public class DiameterOfBinaryTree {
	
	  public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft){
	        if(isRoot){
	            System.out.println("Enter root data");
	        }
	        else{
	            if(isLeft){
	              System.out.println("Enter left child of "+ parentData);
	            }
	            else{
	              System.out.println("Enter right child of "+ parentData);
	            }
	        }
	   
	        Scanner s= new Scanner(System.in);
	        int rootData = s.nextInt();

	        if(rootData==-1){
	            return null;
	        }

	        BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
	        BinaryTreeNode<Integer> leftChild= takeTreeInputBetter(false, rootData, true);
	        BinaryTreeNode<Integer> rightChild= takeTreeInputBetter(false, rootData, false);
	        root.left= leftChild;
	        root.right= rightChild;
	        return root;

	    }
	  
	
	
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
		  if (root==null)
        {
            return 0;
        }
        return findHeight(root.left)+findHeight(root.right)+1;
	}
    
    public static int findHeight(BinaryTreeNode<Integer> root)
    {
        if (root==null)
        {
            return 0;
        }
        int leftHeight=findHeight(root.left);
        int rightHeight=findHeight(root.right);
        
        if(leftHeight>rightHeight)
        {
            return leftHeight+1;
        }
        else
        {
            return rightHeight+1;
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BinaryTreeNode<Integer> root= takeTreeInputBetter(true, 0, true);
		 
		 System.out.println("Diameter of binary tree "+ diameterOfBinaryTree(root));
	}

}
