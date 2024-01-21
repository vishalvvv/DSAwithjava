package priorityqueues1;
import java.util.ArrayList;
public class PriorityMaximumQueue <T>{
	
	
		
		private ArrayList<Element<T>> heap;
		
		public PriorityMaximumQueue() {
			 heap= new ArrayList<>();
		}
		
	    public void insert(T value, int priority){
	    	  Element<T> e= new Element<> (value, priority);
	          heap.add(e);
	          int childIndex= heap.size()-1;
	          int parentIndex=(childIndex-1)/2;

	          while (childIndex > 0 && heap.get(childIndex).priority > heap.get(parentIndex).priority) {
	              Element<T> temp = heap.get(childIndex);
	              heap.set(childIndex, heap.get(parentIndex));
	              heap.set(parentIndex, temp);
	              childIndex = parentIndex;
	              parentIndex = (childIndex - 1) / 2;
	          
	          }
	    
	    }
	    
	 
	   public T getMax() throws PriorityQueueException {
	  	  if(isEmpty()){
	           throw new PriorityQueueException();
	        }
	        return heap.get(0).value;
	  	
	  }
	    
	    public T removeMax() throws PriorityQueueException{
	 	  if(isEmpty()){
	            throw new PriorityQueueException();
	        }
	        Element<T> removed= heap.get(0);
	     T ans = removed.value;
	          heap.set(0, heap.get(heap.size()-1));
	        heap.remove(heap.size()-1);

	       int parentIndex=0;
	        int leftChildIndex= 2*parentIndex+1;
	        int rightChildIndex= 2*parentIndex +2;
	        
	        
	   
	        while (leftChildIndex < heap.size()) {
	            int maxIndex = parentIndex;

	            if (heap.get(leftChildIndex).priority > heap.get(maxIndex).priority) {
	                maxIndex = leftChildIndex;
	            }
	            if (rightChildIndex < heap.size() && heap.get(rightChildIndex).priority > heap.get(maxIndex).priority) {
	                maxIndex = rightChildIndex;
	            }
	            if (maxIndex == parentIndex) {
	                break;
	            }
	            Element<T> temp = heap.get(maxIndex);
	            heap.set(maxIndex, heap.get(parentIndex));
	            heap.set(parentIndex, temp);
	            parentIndex = maxIndex;
	            leftChildIndex = 2 * parentIndex + 1;
	            rightChildIndex = 2 * parentIndex + 2;
	        }
	      
	       return ans;
	 	
	 }    
	    

	    public int size(){
	    	  return heap.size();
	    }
public boolean isEmpty(){
	//  return heap.isEmpty();
	  if(size()==0){
       return true;
     }
    return false;
}
    
    public static void main(String[] args) throws PriorityQueueException {
        PriorityMaximumQueue<String> pq = new PriorityMaximumQueue<String>();

        pq.insert("abc", 15);
        pq.insert("def", 13);
        pq.insert("fsas", 90);
        pq.insert("fsafsafa", 150);
        pq.insert("xvxzxvssa", 120);

        while (!pq.isEmpty()) {
        	System.out.println(pq.getMax());
        //   System.out.println(pq.removeMax());
           pq.removeMax();
      
        	 
        }
    }

}