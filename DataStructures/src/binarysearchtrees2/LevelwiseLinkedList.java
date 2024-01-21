package binarysearchtrees2;
import binaytrees2.BinaryTreeNode;

import java.util.*;

public class LevelwiseLinkedList {
	
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

	
	
	private static ArrayList<LinkedListNode<Integer>> arr = new ArrayList<LinkedListNode<Integer>>();
	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
		// Write your code here
		 if (root==null)
            return null;
        
        Queue<BinaryTreeNode<Integer>> nodesToPrint = new LinkedList<BinaryTreeNode<Integer>>();
        nodesToPrint.add(root);
        nodesToPrint.add(null);
        LinkedListNode<Integer> head = null,tail=null;
        //arr.add(head);
        while(!nodesToPrint.isEmpty())
        {
            BinaryTreeNode<Integer> front=nodesToPrint.poll();
            if (front==null)
            {
                if (nodesToPrint.isEmpty())
                    break;
                else
                {
                    //System.out.println();
                	nodesToPrint.add(null);
                    tail.next=null;
                    tail=tail.next;
                    head=null;
                    
                }
                
            }
            else
            {
                if (head==null)
                {
                    head = new LinkedListNode<Integer>(front.data);
                    tail=head;
                    arr.add(head);
                }
                else
                {
                    tail.next=new LinkedListNode<Integer>(front.data);
                    tail=tail.next;
                }
                //System.out.print(front.data+" ");
                if (front.left!=null)
                    nodesToPrint.add(front.left);
                if (front.right!=null)
                    nodesToPrint.add(front.right);
            }
        }
        return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTreeNode<Integer> root= takeinputLevelWise();
		 ArrayList<LinkedListNode<Integer>> result = constructLinkedListForEachLevel(root);
	        for (LinkedListNode<Integer> head : result) {
	            printLinkedList(head);
	        }
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
