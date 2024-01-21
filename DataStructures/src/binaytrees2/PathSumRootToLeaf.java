package binaytrees2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PathSumRootToLeaf {
	
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

	
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		//Your code goes here
        
        helper1(root,k,"");
	}
    
    public static void helper1(BinaryTreeNode<Integer> root, int k,String s1){
        
        if(root==null)
            return;
        
        if(root.left==null && root.right==null){
            if(k-root.data==0)
                System.out.println(s1+root.data);
            return;
        }
        // if(root.left!=null)
        	helper1(root.left,k-root.data,s1+root.data+" ");
        // if(root.right!=null)
        	helper1(root.right,k-root.data,s1+root.data+" ");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root= takeinputLevelWise();
		 printTreeDetailed(root);
			System.out.println("Enter the target sum:");
			
			int k = 13;
			
			System.out.println("Paths with sum " + k + ":");
			rootToLeafPathsSumToK(root, k);
		 

	}

}
