package linkedlist2;

public class Swaptwonodes {
	
	public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
	
	   Node<Integer> temp = head;
       Node<Integer> prevI = null;
       Node<Integer> prevJ = null;
       int index = 0;
       
       if(i == 0) {
           prevI = head;
       }
       while(temp != null && (prevI == null || prevJ == null)) {
           if(index == i -1) {
               prevI = temp;
           }
           if(index == j-1) {
               prevJ = temp;
           }
           index++;
           temp = temp.next;
       }
       // System.out.println(prevI.data);
       // System.out.println(prevJ.data);
       
       if(i == 0) {
           Node<Integer> temp2 = prevJ.next.next;
       	prevJ.next.next = prevI.next;
       	prevI.next = temp2;
           head = prevJ.next;
           prevJ.next = prevI;
       
       } else {
           Node<Integer> temp2 = prevJ.next;
       	prevJ.next = prevI.next;
       	prevI.next = temp2;
       
       	temp2 = prevI.next.next;
       	prevI.next.next = prevJ.next.next;
       	prevJ.next.next = temp2;
       }
       
       return head;
       }
	
	
	  public static void printLinkedList(Node<Integer> head) {
	        Node<Integer> temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	  
	  
	   public static void main(String[] args) {
	        // Create a linked list
	        Node<Integer> head = new Node<Integer>(1);
	        head.next = new Node<Integer>(2);
	        head.next.next = new Node<Integer>(3);
	        head.next.next.next = new Node<Integer>(4);
	        head.next.next.next.next = new Node<Integer>(5);

	        // Print the original linked list
	        System.out.println("Original Linked List:");
	        printLinkedList(head);

	        // Swap nodes at positions i and j
	        int i = 1; // Example value, modify as needed
	        int j = 3; // Example value, modify as needed
	        head = swapNodes(head, i, j);

	        // Print the modified linked list
	        System.out.println("Modified Linked List:");
	        printLinkedList(head);
	    }

}
