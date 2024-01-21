package binarysearchtrees1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import binaytrees2.BinaryTreeNode;

public class ImprovedSolutionForCheckInBST {
	
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

	
	
	  public static IsBSTReturn isBST2(BinaryTreeNode<Integer> root){
          if(root==null){
              IsBSTReturn ans = new IsBSTReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
              return ans;
          }
          IsBSTReturn leftAns= isBST2(root.left);
          IsBSTReturn rightAns= isBST2(root.right);

          int min= Math.min(root.data, Math.min(leftAns.min, rightAns.min));
          int max= Math.max(root.data, Math.max(leftAns.max, rightAns.max));
          boolean isBST= true;
          if(leftAns.max>=root.data){
              isBST= false;
          }
          if(rightAns.min<root.data){
              isBST= false;
          }
          if(!leftAns.isBST){
              isBST= false;
          }
          if(!rightAns.isBST){
              isBST= false;
          }
          IsBSTReturn ans = new IsBSTReturn(min,max,isBST);
          return ans;



      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root= takeinputLevelWise();
		 printTreeDetailed(root);
		
		 IsBSTReturn ans= isBST2(root);
         System.out.println(ans.min +" "+ans.max+" "+ans.isBST);

	}

}
