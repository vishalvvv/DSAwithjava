package linkedlist;

import java.util.Scanner;

public class PrintithNode {
	
	//  public static Node<Integer> takeInput(){
  //  Scanner s= new Scanner(System.in);
  //  int data = s.nextInt();
  //  Node<Integer> head = null,tail=null;
  //  while(data != -1){
   //   Node<Integer> currentNode= new Node<Integer>(data);
    //  if(head==null){
    //    head=currentNode;
     //   tail=currentNode;
    //  }else{
    
      
     //  tail.next= currentNode;
     //  tail=currentNode;
   //   }
   //   data=s.nextInt();
  //  }
 //   return head;
      // }
		
//	public static void print(Node<Integer> head) {
	//	  Node<Integer> temp = head;
	//      while(temp!= null){
	  //      System.out.print(temp.data+" ");
	  //      temp=temp.next;
	  //    }
	 //     System.out.println();
	// }
	
	public static void printIthNode(Node<Integer> head, int i){

		int count=0;
		  Node<Integer> temp=head;
		   while(count!=i && temp!=null)
		        { 
		            temp=temp.next;
		            count++;
		        }
		       if( count==i &&temp!=null)
		           System.out.println(temp.data);
	
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Node<Integer> head = new Node<>(1);
		    head.next = new Node<>(2);
		    head.next.next = new Node<>(3);
		    head.next.next.next = new Node<>(4);
		    head.next.next.next.next = new Node<>(5);

		    // Calling the printIthNode method to print the data of the i-th node
		    int i = 3; // Example: printing the data of the 3rd node
		    printIthNode(head, i);
		
		//   Node<Integer> head = takeInput();

		    // Printing all the nodes
	//	    print(head);

		    // Printing the data of the i-th node
		 //   int i = 2; // Example: printing the data of the 3rd node
		//    printIthNode(head, i); 

		  
}

}
