package queues;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;
public class ReversetheFirstKElementsintheQueue {
	
	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		//Your code goes here
		   Stack<Integer> s1 = new Stack<>();
        int r=input.size()-k;
        for (int i = 0; i < k; i++) {
            s1.push(input.poll());
        }
        while (s1.size()!=0){
            input.add(s1.pop());
        }
        for (int i = 0; i < r; i++) {
            int i1=input.poll();
            input.add(i1);
        }
        
        return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Queue<Integer> queue = new LinkedList<>();
	        queue.add(1);
	        queue.add(2);
	        queue.add(3);
	        queue.add(4);
	        queue.add(5);

	       System.out.println("Original Queue: " + queue);

	        int k = 3;
	        Queue<Integer> reversedQueue = reverseKElements(queue, k);

	       System.out.println("Reversed " + k + " Elements: " + reversedQueue);
	        
	     

	}

}
