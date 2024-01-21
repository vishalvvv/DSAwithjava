package binarysearchtrees2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;

import binaytrees2.BinaryTreeNode;

public class FindPathInBST {
	
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

	
	  public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
			
			  if (root==null)
	            return null;
	        
	        ArrayList<Integer> output;
	        if (root.data==data)
	        {
	            output= new ArrayList<Integer>();
	            output.add(root.data);
	            return output;
	        }
	        
	        if (data<root.data)
	        {
	            output = getPath(root.left,data);
	            if (output != null)
	            {
	                output.add(root.data);
	            }
	            return output;
	        }
	        
	        if (data>root.data)
	        {
	            output = getPath(root.right,data);
	            if (output != null)
	            {
	                output.add(root.data);
	            }
	            return output;
	        }
	        return null;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTreeNode<Integer> root= takeinputLevelWise();
		
		 ArrayList<Integer> path= getPath(root,2);
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
