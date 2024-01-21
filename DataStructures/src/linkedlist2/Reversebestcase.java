package linkedlist2;
import java.util.Scanner;
public class Reversebestcase {
	
	

	class DoubleNode{

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

	    
	   

 
	  public static Node<Integer> reverseRBest(Node<Integer> head){
	    if(head==null || head.next==null){
	        return head;
	    }
	    Node<Integer> smallHead= reverseRBest(head.next);
	    Node<Integer> reversedTail= head.next;
	    reversedTail.next= head;
	    head.next= null;
	    return smallHead;
	}

	  public static void main(String[] args){

	      Node<Integer> head = takeInput();
	      head= reverseRBest(head);
	      printR(head);

	      }
	}



