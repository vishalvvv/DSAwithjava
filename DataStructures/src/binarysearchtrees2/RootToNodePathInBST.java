package binarysearchtrees2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import binaytrees2.BinaryTreeNode;

public class RootToNodePathInBST {
	
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

	    public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root, int x){
	        if(root==null){
	            return null;
	        }

	        if(root.data==x){
	            ArrayList<Integer> output= new ArrayList<Integer>();
	            output.add(root.data);
	            return output;
	        }
	        ArrayList<Integer> leftOutput= nodeToRootPath(root.left,x);
	        if(leftOutput!=null){
	            leftOutput.add(root.data);
	            return leftOutput;
	        }

	        ArrayList<Integer> rightOutput= nodeToRootPath(root.right,x);
	        if(rightOutput!=null){
	            rightOutput.add(root.data);
	            return rightOutput;
	        }
	        return null;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		BinaryTreeNode<Integer> root= takeinputLevelWise();
		
		 ArrayList<Integer> path= nodeToRootPath(root,1);
		 if(path == null) {
			 System.out.println("not found");
		 }
		 else {
         for(int i:path){
             System.out.println(i);
         }
		 }


	}

}
