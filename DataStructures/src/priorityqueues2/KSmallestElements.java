package priorityqueues2;
import java.util.PriorityQueue;
import java.util.*;
public class KSmallestElements {
	 public static void printKSmallest(int[] arr, int k) {
		 
		 // heap using collections
		 //   PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		 
		  // Create a max-heap with reverse order comparator
	        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
		    
		    
		    // another method 
		 //   PriorityQueue<Integer> pq = new PriorityQueue<>();
		    

	        // Add all elements to the min-heap
	    //    for (int num : arr) {
	     //       pq.add(num);
	    //    }

	        // Print the k smallest elements in ascending order
	     //   for (int i = 0; i < k; i++) {
	     //       System.out.println(pq.poll());
	     //   }
	        
	  //  }
		    
		    
		    for(int i=0;i<k;i++){
	            pq.add(arr[i]);
	        }

	        for(int i=k; i<arr.length;i++){
	            if(pq.peek()>arr[i]){
	                pq.poll();
	                pq.add(arr[i]);
	            }
	        }
	        while(!pq.isEmpty()){
	            System.out.println(pq.poll());
	        }
	    }
	 
	 
	 
	  
	 

	    public static void main(String[] args) {
	      int[] arr = {4, 1, 6, 3, 7, 2, 9, 8};
	      
	        int k = 3;
	        printKSmallest(arr, k);
	}

}
