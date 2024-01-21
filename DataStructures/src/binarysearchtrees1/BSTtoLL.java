package binarysearchtrees1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import binaytrees2.BinaryTreeNode;

// import binaytrees2.BinaryTreeNode;

public class BSTtoLL {
	
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
	
	 

	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
		  Pair ans=helper(root);
      return ans.head;}
  public static Pair helper(BinaryTreeNode<Integer> root){
      if(root==null)
      {
          Pair output=new Pair();
          output.head=null;
          output.tail=null;
          return output;
      }
      Pair lefttree=helper(root.left);
      LinkedListNode<Integer> newNode=new LinkedListNode<>(root.data);
      Pair righttree=helper(root.right);
      Pair output=new Pair();
     if(lefttree.head!=null)
     {
         output.head=lefttree.head;
         lefttree.tail.next=newNode;
      
     }
      else {
          output.head=newNode;
      }
  newNode.next=righttree.head;
      if(righttree.head==null)
      {
          output.tail=newNode;
          
      }
      else{
          output.tail=righttree.tail;
      }
      return output;


	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root= takeinputLevelWise();
		 LinkedListNode<Integer> result = constructLinkedList(root);
		 
	        printLinkedList(result);
	}
	        
		
		public static void printLinkedList(LinkedListNode<Integer> head) {
	        LinkedListNode<Integer> current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
		
	}

}
