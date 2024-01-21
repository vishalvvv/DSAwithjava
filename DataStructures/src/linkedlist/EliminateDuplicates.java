package linkedlist;

public class EliminateDuplicates {
	
	public static Node<Integer> removeDuplicates(Node<Integer> head) {
		//Your code goes here
		 Node<Integer> temp = head;
       Node<Integer> temp1 = head;
        
        if(temp != null) {
            int previousData = temp.data;
        	temp = temp.next;
        

        while(temp != null) {
            if(previousData == temp.data) {
                if(temp.next == null) {
                    temp1.next = null;
                }
            } else {
                temp1.next = temp;
                temp1 = temp;
            }
            previousData = temp.data;
            temp = temp.next;
        }
    }
        return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Node<Integer> head = new Node<>(1);
		    head.next = new Node<>(2);
		    head.next.next = new Node<>(2);
		    head.next.next.next = new Node<>(3);
		    head.next.next.next.next = new Node<>(4);
		    head.next.next.next.next.next = new Node<>(4);
		    head.next.next.next.next.next.next = new Node<>(5);

		    // Calling the removeDuplicates method
		    Node<Integer> updatedHead = removeDuplicates(head);

		    // Printing the updated linked list
		    Node<Integer> temp = updatedHead;
		    while (temp != null) {
		        System.out.print(temp.data + " ");
		        temp = temp.next;

	}

}
}