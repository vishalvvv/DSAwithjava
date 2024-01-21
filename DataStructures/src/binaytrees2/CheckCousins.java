package binaytrees2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckCousins {
	
	
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
	
	public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
		// Write your code here

        return !isSiblings(root, p, q) && level(root, 0, p) == level(root, 0, q);

	}
    	public static boolean isSiblings(BinaryTreeNode<Integer> root,int node1,int node2) {

		if(root==null) {
			return false;
		}
		if(root.left!=null && root.right!=null) {
			
			if(root.left.data == node1 && root.right.data == node2) {
				return true;
			}
			
		}
		return isSiblings(root.left, node1, node2) || isSiblings(root.right, node1, node2);
		
	}
	public static int level(BinaryTreeNode<Integer> root,int k,int node1) {

		if(root==null)
			return -1;
		if(root.data == node1) {
			return k;
		}
		int left  = level(root.left, k+1, node1);
		int right = level(root.right, k+1, node1);
		if(left==-1) {
			return right;
		}
		if(right==-1) {
			return left;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root= takeinputLevelWise();
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the first node: ");
	        int node1 = scanner.nextInt();
	        System.out.print("Enter the second node: ");
	        int node2 = scanner.nextInt();

	        // Check if the nodes are cousins
	        boolean areCousins = isCousin(root, node1, node2);

	        // Print the result
	        if (areCousins) {
	            System.out.println("The given nodes " + node1 + " and " + node2 + " are cousins.");
	        } else {
	            System.out.println("The given nodes " + node1 + " and " + node2 + " are not cousins.");
	        }

	}

}
