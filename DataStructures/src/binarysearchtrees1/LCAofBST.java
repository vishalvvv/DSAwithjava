package binarysearchtrees1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import binaytrees2.BinaryTreeNode;

public class LCAofBST {
	
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


	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		
        if (root == null) 
            return -1; 
   
        // If both n1 and n2 are smaller than root, then LCA lies in left 
        if (root.data > a && root.data > b) 
            return getLCA(root.left, a,b); 
   
        // If both n1 and n2 are greater than root, then LCA lies in right 
        if (root.data < a && root.data < b)  
            return getLCA(root.right, a, b); 
   
        return root.data; 
        
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root= takeinputLevelWise();
		//  printTreeDetailed(root);
		  int a = 2; // First node value
	        int b = 10; // Second node value
	        
	        getLCA(root, a, b);
	        System.out.println("Lowest Common Ancestor of " + a + " and " + b + ": " + getLCA(root,a,b));

	     //   int lca = getLCA(root, a, b);
	    //    System.out.println("Lowest Common Ancestor of " + a + " and " + b + ": " + lca);
		

	}

}
