package binarysearchtrees1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import binaytrees2.BinaryTreeNode;

public class PrintElementsBetweenK1andK2 {
	
	
	  public static void printTreeDetailed(BinaryTreeNode<Integer> root){
	        if(root == null){
	            return;
	        }
	        System.out.println(root.data + ":");
	        if(root.left != null){
	            System.out.print("L" + root.left.data + ", ");
	            }
	        if(root.right != null){
	            System.out.print("R" + root.right.data);
	            }
	        printTreeDetailed(root.left);
	        printTreeDetailed(root.right);

	    }
	
	  public static BinaryTreeNode<Integer> takeinputLevelWise(){
	        Scanner s= new Scanner(System.in);
	        System.out.println("enter root data");
	        int rootData= s.nextInt();

	        if(rootData==-1) {
	        	return null;
	        
	        }

	        BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
	        Queue<BinaryTreeNode<Integer>> pendingChildren= new LinkedList<BinaryTreeNode<Integer>>();
	        pendingChildren.add(root);

	        while(!pendingChildren.isEmpty()){
	            BinaryTreeNode<Integer> front= pendingChildren.poll();
	            System.out.println("Enter left child of "+ front.data);
	            int left= s.nextInt();
	            if(left!=-1){
	                    BinaryTreeNode<Integer> leftChild= new BinaryTreeNode<Integer>(left);
	                    front.left= leftChild;
	                    pendingChildren.add(leftChild);
	            }

	            System.out.println("Enter right child of "+ front.data);
	            int right= s.nextInt();
	            if(right!=-1){
	                    BinaryTreeNode<Integer> rightChild= new BinaryTreeNode<Integer>(right);
	                    front.right= rightChild;
	                    pendingChildren.add(rightChild);
	            }
	        }
	        return root;
	    }

	
	public static void printBetweenK1K2(BinaryTreeNode<Integer> root, int k1, int k2){
        if(root==null){
            return;
        }
        if(root.data<k1){
            printBetweenK1K2(root.right, k1, k2);
        }else if(root.data>k2){
            printBetweenK1K2(root.left, k1, k2);
        }else{
            System.out.println(root.data);
            printBetweenK1K2(root.left,k1,k2);
            printBetweenK1K2(root.right, k1,k2);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root= takeinputLevelWise();
		 printTreeDetailed(root);
		 printBetweenK1K2(root,6,10);

	}

}
