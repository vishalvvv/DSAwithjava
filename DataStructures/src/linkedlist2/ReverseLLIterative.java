package linkedlist2;
import java.util.Scanner;
public class ReverseLLIterative {
	
	public static Node<Integer> reverseIterative(Node<Integer> head){
		
		Node<Integer> prev = null;
        Node<Integer> curr = head;
        Node<Integer> next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
	
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	       System.out.print("Enter the number of elements in the linked list: ");
	        int n = scanner.nextInt();

	        System.out.print("Enter the elements of the linked list: ");
	        Node<Integer> head = null;
	        Node<Integer> tail = null;

	        for (int i = 0; i < n; i++) {
	            int data = scanner.nextInt();
	           Node<Integer> newNode = new Node<>(data);

	            if (head == null) {
	                head = newNode;
	                tail = newNode;
	            } else {
	                tail.next = newNode;
	                tail = newNode;
	            }
	        }

	      System.out.println("Original Linked List:");
	        printLinkedList(head);

	       Node<Integer> reversedHead = reverseIterative(head);

	        System.out.println("Reversed Linked List:");
	        printLinkedList(reversedHead);
	    }

	    private static <Integer> void printLinkedList(Node<Integer> head) {
	        Node<Integer> current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
		
    }

 
	

 
