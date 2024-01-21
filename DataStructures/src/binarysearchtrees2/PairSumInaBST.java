package binarysearchtrees2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import binaytrees2.BinaryTreeNode;

public class PairSumInaBST {
	
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
	
	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		// Write your code here
		
        if(root==null) {
            return ;
        }

      
        Stack<BinaryTreeNode<Integer>> stack1 = new Stack<>();
        Stack<BinaryTreeNode<Integer>> stack2 = new Stack<>();
        BinaryTreeNode<Integer> temp = root;
        while(temp!=null){
            stack1.push( temp  );
            temp = temp.left;
        }
        temp =root;
        while(temp!=null){
            stack2.push( temp  );
            temp = temp.right;
        }


        // Assume BST contains all unique elements
        while( !stack1.isEmpty() && !stack2.isEmpty() && (stack1.peek().data < stack2.peek().data) ) {

            BinaryTreeNode<Integer> frontNode1 = stack1.peek(),frontNode2 = stack2.peek();

            if(frontNode1.data + frontNode2.data == s) {

                System.out.println( frontNode1.data +" " + frontNode2.data );
                stack1.pop();
                stack2.pop();
                    
                

                frontNode1 = frontNode1.right;

                while(frontNode1!=null) {
                    stack1.push(frontNode1);
                    frontNode1 = frontNode1.left;
                }

                frontNode2 = frontNode2.left;

                while(frontNode2!=null) {
                    stack2.push(frontNode2);
                    frontNode2 = frontNode2.right;
                  
                }


            }

            else if( frontNode1.data + frontNode2.data  < s  ) {
                stack1.pop();
                
                
                frontNode1 = frontNode1.right;

                while(frontNode1!=null) {
                    stack1.push(frontNode1);
                    frontNode1 = frontNode1.left;
                }



            }
            else {
                stack2.pop();
                    
                
                frontNode2 = frontNode2.left;

                while(frontNode2!=null) {
                    stack2.push(frontNode2);
                    frontNode2 = frontNode2.right;
                }

            }


        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root= takeinputLevelWise();
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the sum: ");
	        int sum = scanner.nextInt();
	        printNodesSumToS(root, sum);

	}

}
