package linkedlist2;
import java.util.Scanner;
public class PrintRecursive {
	
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
	
	public static void insert(Node<Integer> head, int elem, int pos){
	    Node<Integer> nodeToBeInserted= new Node<Integer>(elem);

	    if(pos==0){
	      nodeToBeInserted.next= head;
	      head= nodeToBeInserted;
	    }else{
	        int count=0;
	        Node<Integer> prev= head;
	        while(count<pos-1 && prev!=null){
	          count++;
	          prev=prev.next;
	        }
	        if(prev!=null){
	            nodeToBeInserted.next= prev.next;
	            prev.next= nodeToBeInserted;
	        }
	    }
	  }
	
	
	 
	
	  public static void printRecursive(Node<Integer> head){
	      if(head==null){
	        return ;
	      }
	     
	      System.out.print(head.data+" ");
	      printRecursive(head.next);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Node<Integer> head = takeInput();
	      printRecursive(head);

	}

}
