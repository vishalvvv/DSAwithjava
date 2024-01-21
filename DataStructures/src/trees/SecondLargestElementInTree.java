package trees;

import java.util.Scanner;

import queues.QueueEmptyException;

public class SecondLargestElementInTree {
	
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
	
	
	
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){


		
    	
        return findSecondLargestT(root).second;
	}
	
    public static Pair<TreeNode<Integer>> findSecondLargestT(TreeNode<Integer> root){
        Pair<TreeNode<Integer>> output;
        if(root == null){
            output = new Pair<TreeNode<Integer>>(null,null);
            return output;
        }
        output = new Pair<TreeNode<Integer>>(root,null);
        for(TreeNode<Integer> child : root.children){
            Pair<TreeNode<Integer>> childPair = findSecondLargestT(child);
            if(childPair.first.data > output.first.data){
                if(childPair.second==null||childPair.second.data < output.first.data){
                    output.second = output.first;
                    output.first = childPair.first;
                } else {
                    output.first = childPair.first;
                    output.second = childPair.second;
                }
                } else if(childPair.first.data.equals(output.first.data) && childPair.second != null){
                    output.second = childPair.second;
                } else if(output.first.data != childPair.first.data && (output.second == null || childPair.first.data>output.second.data)){
                    output.second = childPair.first;
                }
            }
            return output;
        }

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInput();
		  TreeNode<Integer> secondLargest = findSecondLargest(root);
	        if (secondLargest != null) {
	            System.out.println("Second largest element: " + secondLargest.data);
	        } else {
	            System.out.println("No second largest element found.");
	        }
	}

}
