package trees;

import java.util.Scanner;

import queues.QueueEmptyException;

public class NextLargerElement {
	

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
	
	
public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		
		// Write your code here

        if(root == null) return null;
        TreeNode<Integer> nextLargerNode = null;
        if(root.data > n) nextLargerNode = root;
        
        for(int i = 0; i < root.children.size(); i++) {
            TreeNode<Integer> nextLargerInChild = findNextLargerNode(root.children.get(i), n);
            if(nextLargerInChild != null) {
                if(nextLargerNode == null || nextLargerInChild.data < nextLargerNode.data) {
                    nextLargerNode = nextLargerInChild;
                }
            }
        }
        return nextLargerNode;
	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInput();
		 Scanner scanner = new Scanner(System.in);
		    System.out.println("Enter a value to find the next larger element:");
		    int value = scanner.nextInt();
		    TreeNode<Integer> nextLarger = findNextLargerNode(root, value);
		    if (nextLarger != null) {
		        System.out.println("Next larger element: " + nextLarger.data);
		    } else {
		        System.out.println("No larger element found.");
		    }
		


	}

}
