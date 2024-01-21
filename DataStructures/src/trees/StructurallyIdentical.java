package trees;
import java.util.Scanner;

import queues.QueueEmptyException;
public class StructurallyIdentical {
	
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
	 
		public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){
			
			   if(root1.data!=root2.data)
		            return false;

		        if(root1.children.size()!=root2.children.size())
		            return false;

		        boolean ans=true;
		        for(int i=0;i<root1.children.size();i++){
		            ans=ans && checkIdentical(root1.children.get(i),root2.children.get(i));
		        }

		        return ans;
			
		}


	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		 TreeNode<Integer> root1 = takeInput();
		 TreeNode<Integer> root2 = takeInput();
		    boolean areIdentical = checkIdentical(root1, root2);
		    System.out.println("The trees are " + (areIdentical ? "" : "not ") + "structurally identical.");


	}

}
