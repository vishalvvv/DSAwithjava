package binaytrees2;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class LongestLeafToRootPath {
	
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
	
	public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root){
		// Write your code here
		
        if(root==null) {
			return new ArrayList<>();
		}
		
		ArrayList<Integer> leftArrayList = longestRootToLeafPath(root.left);
		ArrayList<Integer> rightArrayList = longestRootToLeafPath(root.right);
		
		if(leftArrayList.size()>=rightArrayList.size()) {
			
			leftArrayList.add(root.data);
			return leftArrayList;
			
		}
		else {
			rightArrayList.add(root.data);
			return rightArrayList;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root= takeinputLevelWise();
		   ArrayList<Integer> longestPath = longestRootToLeafPath(root);
		   

	        // Print the longest path
	        System.out.print("Longest Path: ");
	      for (int i = longestPath.size() - 1; i >= 0; i--) {
	            System.out.print(longestPath.get(i));
	            if (i != 0) {
	                System.out.print(" -> ");
	            }
	        }
		

	}

  }
