package linkedlist2;

public class kReverse {
	public static Node<Integer> kReverse(Node<Integer> head, int k) {
	   if(k==0 || k==1)
           return head;
       
       if(head==null || head.next==null)
           return head;
       
       //LinkedListNode<Integer> h1=head;
       Node<Integer> prev=null;
       Node<Integer> h2=head;
       int i=0;
       while(h2!=null && i<k){
           Node<Integer> next=h2.next;
           h2.next=prev;
           prev=h2;
           h2=next;
           i++;
       }
       
       head.next=kReverse(h2,k);
       return prev;
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
		// TODO Auto-generated method stub
		
        Node<Integer> head = new Node<Integer>(1);
        head.next = new Node<Integer>(2);
        head.next.next = new Node<Integer>(3);
        head.next.next.next = new Node<Integer>(4);
        head.next.next.next.next = new Node<Integer>(5);

        // Print the original linked list
        System.out.println("Original Linked List:");
        printLinkedList(head);

        // Reverse the linked list in groups of k
        int k = 3; // Example value, modify as needed
        head = kReverse(head, k);

        // Print the modified linked list
        System.out.println("Modified Linked List:");
        printLinkedList(head);


	}

}
