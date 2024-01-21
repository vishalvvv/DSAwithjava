package trees;

import java.util.Scanner;

import queues.QueueEmptyException;

public class RemoveLeafNodesInTree {
	
	
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
	 
	
	
	
	 // Function which will print the
    // tree level wise
   public static void printTreeLevelwise(TreeNode<Integer> root)
    {
        if (root == null)
            return;

        System.out.print(root.data+" :");

        for (int i = 0; i < root.children.size(); i++)
            System.out.print(root.children.get(i).data+" ");

       System.out.println();

        for (int i = 0; i < root.children.size(); i++)
            printTreeLevelwise(root.children.get(i));
	}


	
	public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {
		
		
		
         if(root==null){ return null;}// if root is null return null
        if(root.children.size()==0){// if root itself is leaf return null
            return null;
        }
        // if root.children is a leaf node
        // then delete it from children vector
        for (int i = 0; i < root.children.size(); i++) {

            TreeNode<Integer> child= root.children.get(i);
            if (child.children.size() == 0) {

                // shifting the vector to left
                // after the point i
                for (int j = i; j < root.children.size() - 1; j++)
                    root.children.set(j, root.children.get(j + 1));

                // delete the last element
                root.children.remove(root.children.size()-1);

                i--;
            
        }
            
        }
        // Remove all leaf node
        // of children of root
        for (int i = 0;
             i < root.children.size();
             i++) {

            // call function for root.children
            root.children.set(i,removeLeafNodes(root.children.get(i)));
        }
        return root;
	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInput();
	//	removeLeafNodes(root);
	//	printTreeLevelwise(root);
		  System.out.println("Original Tree:");
		    printTreeLevelwise(root);

		    // Remove leaf nodes
		    TreeNode<Integer> modifiedRoot = removeLeafNodes(root);

		    // Print the modified tree
		    System.out.println("Modified Tree (After removing leaf nodes):");
		    printTreeLevelwise(modifiedRoot);
		

	}

}
