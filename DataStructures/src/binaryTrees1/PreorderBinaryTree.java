package binaryTrees1;

import java.util.Scanner;

public class PreorderBinaryTree {
	
	
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
	
	
	 public static void printTreeDetailed(BinaryTreeNode<Integer> root){
	        if(root == null){
	            return;
	        }
	        System.out.print(root.data + ":");
	        if(root.left != null){
	            System.out.print("L" + root.left.data + ", ");
	            }
	        if(root.right != null){
	            System.out.print("R" + root.right.data);
	            }
	        System.out.println();
	        printTreeDetailed(root.left);
	        printTreeDetailed(root.right);

	    }
	
	
	public static void preOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
		 if (root == null) {
            return;
        }
        
        // Visit the root node
        System.out.print(root.data + " ");
        
        // Traverse the left subtree
        preOrder(root.left);
        
        // Traverse the right subtree
        preOrder(root.right);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 BinaryTreeNode<Integer> root= takeTreeInputBetter(true, 0, true);
		 printTreeDetailed(root);
		  preOrder(root);

	}

}
