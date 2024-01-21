package linkedlist;

public class DeleteNodeinLL {
	public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
		// Write your code here.
		 int index = 0;
        Node<Integer> temp = head;
        Node<Integer> previousNode = head;
        while(temp != null) {
            if(pos == 0) {
                return head.next;
            } else if(index == pos) {
                break;
            }
            index++;
            previousNode = temp;
            temp = temp.next;
        }
        if(temp != null) {
            previousNode.next = temp.next;
        	return head;
        } else {
            return head;
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Node<Integer> head = new Node<>(1);
		    head.next = new Node<>(2);
		    head.next.next = new Node<>(3);
		    head.next.next.next = new Node<>(4);
		    head.next.next.next.next = new Node<>(5);

		    // Calling the deleteNode method to delete a node at a specific position
		    int positionToDelete = 2;
		    Node<Integer> updatedHead = deleteNode(head, positionToDelete);

		    // Printing the updated linked list
		    Node<Integer> temp = updatedHead;
		    while (temp != null) {
		        System.out.print(temp.data + " ");
		        temp = temp.next;

	}

}
}