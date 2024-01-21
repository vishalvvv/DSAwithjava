package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import binaryTrees1.BinaryTreeNode;
import queues.QueueEmptyException;

public class ReplaceNodeWithDepth {
	
	 public static TreeNode<Integer> takeInput() throws QueueEmptyException{
	        Scanner s= new Scanner(System.in);
	        QueueUsingLL<TreeNode<Integer>> pendingNodes= new QueueUsingLL<>();
	        System.out.println("Enter the root data ");
	        int rootData= s.nextInt();
	        if(rootData == -1) {
	            return null;
	        }

	        TreeNode<Integer> root= new TreeNode<Integer>(rootData);
	        pendingNodes.enqueue(root);

	        while(!pendingNodes.isEmpty()){
	            TreeNode<Integer> front= pendingNodes.dequeue();
	            System.out.println("Enter no. of children "+ front.data);
	            int numChild= s.nextInt();
	           for(int i=0;i<numChild;i++){
	                System.out.println("Enter the  "+i+" th child data for:"+ front.data);
	           int childData= s.nextInt();
	                TreeNode<Integer> childNode= new TreeNode<>(childData);
	                front.children.add(childNode);
	                pendingNodes.enqueue(childNode);
	           }
	        }
	        return root;
	    }
	 
		
	  public static void printTreeLevelWise(TreeNode<Integer> root){
	  		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();
	  		pendingNodes.enqueue(root);
	  		pendingNodes.enqueue(null);
	  		while(!pendingNodes.isEmpty()){
	  			TreeNode<Integer> currentNode;
	  			try {
	  				currentNode = pendingNodes.dequeue();
	  				if(currentNode==null){
	  					System.out.println();
	  					if(!pendingNodes.isEmpty()){
	  						pendingNodes.enqueue(null);
	  						continue;
	  					}else{
	  						break;
	  					}
	  				}
	  				System.out.print(currentNode.data+" ");
	  				int numChild = currentNode.children.size();
	  				for(int i = 0 ; i < numChild; i++){
	  					pendingNodes.enqueue(currentNode.children.get(i));
	  				}

	  			} catch (QueueEmptyException e) {
	  			}
	  		}
	  	}
	 
//	 public static void printTree(TreeNode<Integer> root){
	 //       //Special case not base case
	 //       if(root==null){
	  //          return ;
	  //      }
	   //     System.out.print(root.data+": ");
	   //     for(int i=0; i<root.children.size(); i++){
	    //        System.out.print(root.children.get(i).data+ " ");
	    //    }
	   //     System.out.println();
	   //     for(int i=0;i<root.children.size();i++){
	     //       TreeNode<Integer> child= root.children.get(i);
	    //        printTree(child);
	   //     }
//	 }
	 
	public static void replaceWithDepthValue(TreeNode<Integer> root){

		// Write your code here
        root=helper1(root,0);
		
	}
    
    public static TreeNode<Integer> helper1(TreeNode<Integer> root,int n){
        
        root.data=n;
        for(int i=0;i<root.children.size();i++){
            helper1(root.children.get(i),n+1);
        }
        return root;
    }

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInput();
	
		replaceWithDepthValue(root);
	//	printTree(root);
		printTreeLevelWise(root);
		 
		
		 

	}

}
