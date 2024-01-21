package linkedlist;

public class PrintReversedLL {
	
	public static void printReverse(Node<Integer> head) {
		//Your code goes here
		   if(head == null) {
            return;
        }
        printReverse(head.next);
        System.out.print(head.data + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Node<Integer> head=printReverse();
	//	print(head);
	//	System.out.println(length(head));
		
		

	       Node<Integer> head = new Node<>(1);
	        head.next = new Node<>(2);
	        head.next.next = new Node<>(3);
	        head.next.next.next = new Node<>(4);
	        head.next.next.next.next = new Node<>(5);

	        

	        printReverse(head);
	}

}
