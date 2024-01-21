package linkedlist;

// import java.util.Scanner;

public class AppendLastNtoFirst {
	
	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		//Your code goes here
		    if(head != null && n > 0) {
            Node<Integer> temp = head;
        Node<Integer> newHead = temp;
        Node<Integer> previousNewHead = temp;
        
        int length = 0;
        
       while(temp != null ) {
            temp = temp.next;
            length++;
      }
     
        
        int index = 0;
        temp = head;
       while(temp.next != null) {
            if(index == length - n - 1) {
               newHead = temp.next;
                previousNewHead = temp;
             
           }
           temp = temp.next;
            index++;
        }
        previousNewHead.next = null;
        if(temp.next == null) {
            temp.next = head;
        }
        
        return newHead;
        } else {
             return head;
        }
	}
	//   public static void print(Node<Integer> head) {
			
		//	 Node<Integer> temp = head;
		//	while(temp!=null) {
		//		System.out.print(temp.data+" ");
		//		temp=temp.next;
		//	}
		//	System.out.println();
//	   }
	//  public static Node<Integer> takeInput(){
	  //      Scanner s= new Scanner(System.in);
	   //     int data = s.nextInt();
	    //    Node<Integer> head = null,tail=null;
	    //    while(data != -1){
	     //     Node<Integer> currentNode= new Node<Integer>(data);
	      //    if(head==null){
	       //     head=currentNode;
	       //     tail=currentNode;
	      //    }else{
	        //    Node<Integer> tail = head;
	         //   while(tail.next!=null){
	        //        tail= tail.next;
	          //  }
	      //     tail.next= currentNode;
	       //    tail=currentNode;
	      //    }
	     //     data=s.nextInt();
	     //   }
	 //       return head;
	//  }
		    public static void main(String[] args) {
				// TODO Auto-generated method stub
		    //	System.out.println("Original Linked List:");
		    //    printLinkedList(head);

		        // Calling the appendLastNToFirst method with n = 2
		    //    int n = 2;
		     //   head = appendLastNToFirst(head, n);

		        // Printing the modified linked list
		     //   System.out.println("Modified Linked List:");
		      //  printLinkedList(head);
		    	 Node<Integer> head = new Node<>(1);
		    	    head.next = new Node<>(2);
		    	    head.next.next = new Node<>(3);
		    	    head.next.next.next = new Node<>(4);
		    	    head.next.next.next.next = new Node<>(5);

		    	    // Calling the appendLastNToFirst method to append the last n nodes to the front
		    	    int n = 2; // Example: appending the last 2 nodes to the front
		    	    Node<Integer> newHead = appendLastNToFirst(head, n);

		    	    // Print the modified linked list
		    	    Node<Integer> temp = newHead;
		    	    while (temp != null) {
		    	        System.out.print(temp.data + " ");
		    	        temp = temp.next;
		    	   
			}
	}
}
	
	


