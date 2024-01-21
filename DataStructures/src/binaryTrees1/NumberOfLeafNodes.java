package binaryTrees1;

import java.util.Scanner;

public class NumberOfLeafNodes {
	
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
	
	 public static int numLeaves(BinaryTreeNode<Integer> root){
	        if(root==null){
	            return 0;
	        }
	        if(root.left==null &&root.right==null){
	            return 1;
	        }
	        return numLeaves(root.left)+numLeaves(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  BinaryTreeNode<Integer> root= takeTreeInputBetter(true, 0, true);
		System.out.println("num leaves " + numLeaves(root));

	}

}
