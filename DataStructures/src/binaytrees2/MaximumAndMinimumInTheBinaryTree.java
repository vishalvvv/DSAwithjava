package binaytrees2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MaximumAndMinimumInTheBinaryTree {

	
	
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

	
	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null){
        	 Pair<Integer, Integer> ans = new Pair<>(Integer.MAX_VALUE, Integer.MIN_VALUE);
            return ans;
        }
        
        Pair<Integer,Integer> p1 = getMinAndMax(root.left);
        Pair<Integer,Integer> p2 = getMinAndMax(root.right);
        int min=Math.min(root.data,Math.min(p1.minimum,p2.minimum));
        int max=Math.max(root.data,Math.max(p1.maximum,p2.maximum));
        Pair<Integer,Integer> ans1=new Pair<>(min,max);
        return ans1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root= takeinputLevelWise();
		// printTreeDetailed(root);
		 Pair<Integer, Integer> result = getMinAndMax(root);
	        System.out.println("Minimum value: " + result.minimum);
	        System.out.println("Maximum value: " + result.maximum);

	}

}
