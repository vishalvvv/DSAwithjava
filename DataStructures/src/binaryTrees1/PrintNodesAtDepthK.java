package binaryTrees1;

import java.util.Scanner;

public class PrintNodesAtDepthK {
	
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
	
	  public static void printAtDepthK(BinaryTreeNode<Integer> root, int k){
	        if(root==null){
	            return;
	        }
	        if(k==0){
	            System.out.println(root.data);
	            return;
	        }

	        printAtDepthK(root.left, k-1);
	        printAtDepthK(root.right, k-1);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
		
		System.out.println("print at depth k");
		printAtDepthK(root,2);

	}

}
