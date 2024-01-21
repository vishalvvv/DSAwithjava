package binarysearchtrees1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import binaytrees2.BinaryTreeNode;

public class ConstructBSTFromSortedArray {
	

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

	
	
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
	    return SortedArrayToBSTHelper(arr,0,n-1);
	
}

public static BinaryTreeNode<Integer> SortedArrayToBSTHelper(int[] arr, int si, int ei){
    if (si>ei)
        return null;
    
    int mid=(si+ei)/2;
    BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);
    
    root.left=SortedArrayToBSTHelper(arr,si,mid-1);
    root.right=SortedArrayToBSTHelper(arr,mid+1,ei);
    return root;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the size of the sorted array: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter the elements of the sorted array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        BinaryTreeNode<Integer> root = SortedArrayToBST(arr, n);

		  

		    // Print the constructed binary search tree
		    printTreeDetailed(root);
	
		

	}

}
