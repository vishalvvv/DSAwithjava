package trees;

import java.util.Scanner;

import queues.QueueEmptyException;

public class CountLeafNodes {
	
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
	
	
	public static int countLeafNodes(TreeNode<Integer> root){

		// Write your code here
        
        if(root == null)
            return 0;
        
        int count = 0;
        if(root.children.size() == 0)
            count++;
        for(TreeNode<Integer> child : root.children)
            count += countLeafNodes(child);
        return count;
	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInput();
		int leafNodeCount = countLeafNodes(root);
	    System.out.println("Number of leaf nodes: " + leafNodeCount);

	}

}
