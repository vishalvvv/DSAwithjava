package binaryTrees1;

import java.util.Scanner;

public class IsNodePresent {
	
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
	  
	
	
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
        
        if(root==null) {
        	
            return false;
        }
        if(root.data==x) {
            return true;
        }
        
        return isNodePresent(root.left,x) || isNodePresent(root.right,x);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
		 
		// isNodePresent(root,3);
		 int x=8;
		 boolean isPresent = isNodePresent(root, x);
		    
		    if (isPresent) {
		        System.out.println("Node " + x + " is present in the tree.");
		    } else {
		        System.out.println("Node " + x + " is not present in the tree.");
		    }
		 
		 

	}

}
