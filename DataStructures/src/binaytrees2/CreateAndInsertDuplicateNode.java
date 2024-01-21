package binaytrees2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// import binaryTrees1.BinaryTreeNode;

public class CreateAndInsertDuplicateNode {
	
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

	

		public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
			//Your code goes here
			    if (root==null)
	            return;

	        BinaryTreeNode<Integer> duplicateNode = new BinaryTreeNode<Integer>(root.data);
	        //duplicateNode.data=root.data;
	        BinaryTreeNode<Integer> temp=root.left;
	        root.left=duplicateNode;
	        duplicateNode.left=temp;
	        insertDuplicateNode(root.left.left);
	        insertDuplicateNode(root.right);
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root= takeinputLevelWise();
		System.out.println("Original Tree:");
		 printTreeDetailed(root);
		 
		 insertDuplicateNode(root);
			System.out.println("Tree after inserting duplicate nodes:");
			printTreeDetailed(root);
		
		 

	}

}
