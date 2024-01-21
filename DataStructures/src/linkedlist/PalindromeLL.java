package linkedlist;
import java.util.*;
public class PalindromeLL {
	
	public static boolean isPalindrome(Node<Integer> head) {
		//Your code goes here
		  Node<Integer> node=head;
        ArrayList<Integer> arr = new ArrayList<>();
        while (node!=null)
        {
            arr.add(node.data);
            node=node.next;
        }
        int start=0, end=arr.size()-1;
        while(start<end)
        {
            if (arr.get(start)!=arr.get(end))
            {
                return false;
            }
            else
            {
                start=start+1;
                end=end-1;
            }
        }
        
        return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Node<Integer> head = new Node<>(1);
		    head.next = new Node<>(2);
		    head.next.next = new Node<>(3);
		    head.next.next.next = new Node<>(2);
		    head.next.next.next.next = new Node<>(1);

		    // Calling the isPalindrome method
		    boolean isPalin = isPalindrome(head);

		    // Printing the result
		    System.out.println("Is the linked list a palindrome? " + isPalin);

	}

}
