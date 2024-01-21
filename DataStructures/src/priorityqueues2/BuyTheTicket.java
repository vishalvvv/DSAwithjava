package priorityqueues2;
import java.util.*;
public class BuyTheTicket {
	
	public static int buyTicket(int input[], int k) {
	
	  Queue<Integer> queue = new LinkedList<>();
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      for (int i=0;i<input.length;i++){
          queue.add(i);
          pq.add(input[i]);
      }
      int time=0;
      while (!queue.isEmpty()){
          if (input[queue.peek()] < pq.peek())
          {
              queue.add(queue.poll());
          }
          else
          {
              int idx = queue.poll();
              pq.remove();
              time++;
              if (idx == k)
              {
                  break;
              }
          }
      }
      return time;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,2,2,4};
        System.out.println(buyTicket(arr, 3)); //output 4
		int arr1[] = {3,9,4};
		System.out.println(buyTicket(arr1, 2)); //output 2

	}

}
