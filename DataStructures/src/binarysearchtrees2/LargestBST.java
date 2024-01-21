package binarysearchtrees2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import binaytrees2.BinaryTreeNode;

public class LargestBST {
	
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

	

	

	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		// Write your code here
		   if (root==null)
            return 0;
        
        if (isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE))
            return findHeight(root);
        else
        {
        	return Math.max(largestBSTSubtree(root.left),largestBSTSubtree(root.right));
        }
            
	}
    
    private static int findHeight(BinaryTreeNode<Integer> root)
    {
        if (root==null)
            return 0;
        
        if (root.left==null && root.right==null)
            return 1;
        
        return Math.max(findHeight(root.left),findHeight(root.right))+1;
    }
    
    private static boolean isBST(BinaryTreeNode<Integer> root, int min, int max)
    {
        if(root == null)
			return true;
		
        if(root.data < min || root.data > max)
			return false;
		else
			return isBST(root.left,min,root.data -1) && isBST(root.right,root.data +1,max);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root= takeinputLevelWise();
		
		  
		 int largestBSTSize = largestBSTSubtree(root);
	        System.out.println("Largest BST Subtree size: " + largestBSTSize);
	}

}
