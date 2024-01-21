package linkedlist;

public class FindaNodeinLL {
	
	public static int findNode(Node<Integer> head, int n) {
		// Write your code here.
		 int index = 0;
        Node<Integer> temp = head;
        while(temp != null) {
            if(n == temp.data) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        
            return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Node<Integer> head = new Node<>(1);
		    head.next = new Node<>(2);
		    head.next.next = new Node<>(3);
		    head.next.next.next = new Node<>(4);
		    head.next.next.next.next = new Node<>(5);

		    // Calling the findNode method to search for a specific node
		    int nodeToFind = 3;
		    int index = findNode(head, nodeToFind);

		    // Printing the result
		    if (index != -1) {
		        System.out.println("Node with value " + nodeToFind + " found at index " + index);
		    } else {
		        System.out.println("Node with value " + nodeToFind + " not found in the linked list.");
		    }
		}
		

	

}
