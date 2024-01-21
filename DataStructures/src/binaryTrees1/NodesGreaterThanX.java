package binaryTrees1;

import java.util.Scanner;

public class NodesGreaterThanX {
	
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
	
	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		//Your code goes here
		  if(root==null)
            return 0;
        int c=0;
        if(root.data>x)
            c++;
        return c+countNodesGreaterThanX(root.left,x)+countNodesGreaterThanX(root.right,x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
		System.out.println("nodes greater than x"+ countNodesGreaterThanX(root, 2));
		
	}


}
