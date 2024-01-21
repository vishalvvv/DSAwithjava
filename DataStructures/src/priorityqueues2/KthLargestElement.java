package priorityqueues2;
import java.util.PriorityQueue;
public class KthLargestElement {
	public static int kthLargest( int[] input, int k) {
	 PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	 
	 // method 1
	 
	 for(int i=0;i<k;i++) {
			pq.add(input[i]); //place the first k elements in priority Queue
			 
		}
	//	System.out.println(priorityQueue); //[2, 6, 10, 11]
		for(int i= k ;i < input.length;i++) { //go from k to the last of the array.

			if(input[i] > pq.peek() ) { //if element is greater than the smallest stored in priority Queue remove it
				pq.remove();
			//	System.out.println(priorityQueue);
				pq.add(input[i]);//add the greater element to the priority Queue
			}
		//	System.out.println(priorityQueue);
		}
		 //after entire process is completed, inside queue you have k largest elements, remove from the queue to get kth largest element
		return pq.remove();
		

	}
	
	// method 2
	
  /*   for(int i=0;i<k;i++)
     {
         pq.add(input[i]);
     }
     
     for(int i=k;i<input.length;i++)
     {
         int minVal=pq.peek();
         if(minVal<input[i])
             minVal=input[i];
         if(minVal!=pq.peek())
         {
             pq.poll();
             pq.add(minVal);
         }
     }
     
     int minVal=Integer.MAX_VALUE;
     while(!pq.isEmpty())
     {
         int check=pq.poll();
         if(check<minVal)
             minVal=check;
     }
     return minVal;
	
}
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,4,8,7,11,3};
	//	int arr1[] = {2,6,10,11,13,4,1,20};
		System.out.println(kthLargest( arr, 2)); 
		// System.out.println(kthLargest(arr1, 4));	

	}

}
