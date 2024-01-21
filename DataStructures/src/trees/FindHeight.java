package trees;

import java.util.Scanner;

import queues.QueueEmptyException;

public class FindHeight {
	
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
	  
	public static int getHeight(TreeNode<Integer> root){
	   int h=0;
       for(int i=0;i<root.children.size();i++){
           int h1=getHeight(root.children.get(i));
           if(h1>h)
               h=h1;
       }
       return h+1;
	}


	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInput();
		 int height = getHeight(root);
		    System.out.println("Height of the tree: " + height);

	}

}
