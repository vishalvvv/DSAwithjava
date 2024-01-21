package linkedlist2;

import java.util.Scanner;

public class ReversePair {  
	

  static	class DoubleNode{

	    Node<Integer> head;
	    Node<Integer> tail;
	    DoubleNode(){

	    }

	    DoubleNode(Node<Integer> head, Node<Integer> tail){
	      this.head= head;
	      this.tail= tail;
	    }
	    
  }
	    
	    
	    
	   public static Node<Integer> takeInput(){
	        Scanner s= new Scanner(System.in);
	        int data = s.nextInt();
	        Node<Integer> head = null,tail=null;
	        while(data != -1){
	          Node<Integer> currentNode= new Node<Integer>(data);
	          if(head==null){
	            head=currentNode;
	            tail=currentNode;
	          }else{
	          
	        tail.next = currentNode;
	        tail=currentNode;    
	    }
	    data= s.nextInt();
	        }
	        return head;
	    }
	    
	    
	    
	        public static void printR(Node<Integer> head){
	          if(head==null){
	        return ;
	      }
	      
	      System.out.print(head.data+" ");
	      printR(head.next);
	    }
	    
	    

	   public static DoubleNode reverseRBetter(Node<Integer> head){
	    DoubleNode ans;
	    if(head==null || head.next ==null){
	        ans= new DoubleNode(head,head);
	      // ans.head= head;
	     //   ans.tail= head;
	        return ans;
	    }

	    DoubleNode smallAns= reverseRBetter(head.next);
	    smallAns.tail.next= head;
	    head.next= null;
	    ans = new DoubleNode();
	    ans.head= smallAns.head;
	    ans.tail= head;
	    return ans;
	}
	
	    
	
	public static void main(String[] args){

	      Node<Integer> head = takeInput();
	      DoubleNode ans= reverseRBetter(head);
	     printR(ans.head);

	     }
	}
  	
	



