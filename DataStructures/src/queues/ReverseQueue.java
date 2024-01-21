package queues;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class ReverseQueue {
	
	public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here
		  if (input.size()==0 || input.size()==1)
        {
            return;
        }
        
        int temp=input.remove();
        reverseQueue(input);
        input.add(temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Queue<Integer> queue = new LinkedList<>();
	       queue.add(1);
	        queue.add(2);
	        queue.add(3);
	       queue.add(4);
	       queue.add(5);

	        // Print the original queue
	        System.out.println("Original Queue: " + queue);

	        // Reverse the queue
	        reverseQueue(queue);

	        // Print the reversed queue
	       System.out.println("Reversed Queue: " + queue);
	        
		 

	}

}
