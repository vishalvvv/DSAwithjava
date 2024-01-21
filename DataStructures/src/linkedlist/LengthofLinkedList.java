package linkedlist;

public class LengthofLinkedList {
	
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1=new Node<>(10);
		 Node<Integer> n2= new Node<>(20);
		    Node<Integer> n3= new Node<>(30);
		    
		    n1.next=n2;
		    n2.next=n3;
		    return n1;
	}
		
	public static void print(Node<Integer> head) {
		  Node<Integer> temp = head;
	      while(temp!= null){
	        System.out.print(temp.data+" ");
	        temp=temp.next;
	      }
	      System.out.println();
	}
	
	 public static int length(Node<Integer> head){
	        //Your code goes here

	        int count=0;
	        Node<Integer> temp=head;
	        
      while(temp!=null){
	    count++;
	    temp=temp.next;
	}
	 return count;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Integer> head=createLinkedList();
		print(head);
		System.out.println(length(head));
		
	
	}

}
