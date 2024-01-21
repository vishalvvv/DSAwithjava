package linkedlist2;
import java.util.Scanner;


public class ReversellRecursive {
	
	
	
	 public static  Node<Integer> takeInput(){
	        Scanner s= new Scanner(System.in);
	        int data = s.nextInt();
	        Node<Integer> head = null,tail=null;
	        while(data != -1){
	          Node<Integer> currentNode= new Node<Integer>(data);
	          if(head==null){
	            head=currentNode;
	            tail=currentNode;
	          }else{
	            //Node<Integer> tail = head;
	          //  while(tail.next!==null){
	          //      tail= tail.next;
	          //  }
	        //    tail.next= currentNode;
	        //  }
	        //  data=s.nextInt();
	        tail.next = currentNode;
	        tail=currentNode;    //tail=tail.next;
	    }
	        
	    data= s.nextInt();
	        }
	        return head;
	        
	 }
	    public static void printRecursive(Node<Integer> head){
	        if(head==null){
	          return ;
	        }
	     
	        System.out.print(head.data+" ");
	        printRecursive(head.next);
	      }
	public static Node<Integer> reverseRecursive(Node<Integer> head) {
		//Your code goes here
         if(head == null || head.next == null){
        	 
            return head;
        }
        Node<Integer> smallHead = reverseRecursive(head.next);
       Node<Integer> tail = smallHead;
       while(tail.next != null){
           tail= tail.next;
         }
         tail.next =head;
         head.next= null;
         return smallHead;
       
        
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Node<Integer> head = takeInput();
	      head= reverseRecursive(head);
	      printRecursive(head);
		
	}

}
