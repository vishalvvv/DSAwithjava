package binarysearchtrees1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import binaytrees2.BinaryTreeNode;

public class ReplaceWithSumOfGreaterNodes {
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if (root==null)
        {
            return;
        }
        Queue<BinaryTreeNode<Integer>> nodesToPrint=new LinkedList<BinaryTreeNode<Integer>>();
        nodesToPrint.add(root);
        while(!nodesToPrint.isEmpty())
        {
            BinaryTreeNode<Integer> front = nodesToPrint.poll();
            System.out.print(front.data+":");
            if (front.left!=null)
            {
                nodesToPrint.add(front.left);
                System.out.print("L:"+front.left.data);
            }
            else
            {
                System.out.print("L:-1");
            }
            
            if (front.right!=null)
            {
                nodesToPrint.add(front.right);
                System.out.print(",R:"+front.right.data);
            }
            else
            {
                System.out.print(",R:-1");
            }
            System.out.println();
        }
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
	
	 
	
	 
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		if(root == null){
            return;
        }
        int ans = replace(root ,0);
        
		
	}
    public static int replace(BinaryTreeNode<Integer> root ,int sum){
        if(root == null){
            return 0;
        }
        
        int right = replace(root.right ,sum);
        int rootdata = root.data;
        root.data = root.data + right + sum;
        int left = replace(root.left ,root.data);
        
        return rootdata + right + left;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  BinaryTreeNode<Integer> root=  takeinputLevelWise();

	//	 printTreeDetailed(root);
		 
		 replaceWithLargerNodesSum(root);
		 System.out.println("BST after replacing nodes with the sum of greater nodes:");
		 printLevelWise(root);
	     //   printTreeDetailed(root);
		

	}

}
