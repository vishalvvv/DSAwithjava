package stacks;
import linkedlist.Node;
public class StackUsingLL<T> {
	
	private Node<T> head;
	private int size;


	
	
	public StackUsingLL() {
		head=null;
		size=0;
	}
	
	public int size() {
		
		return size;
		
	}
	
	public boolean isEmpty() {
	
		
		return size==0;
		
		
	}
	
	//Pushing happening at he begining of the LL

	
	public void push(T elem) {
		Node<T> newNode = new Node<T>(elem);
        newNode.next = head;
        head= newNode;
        size++;
	}
	
	public T top() throws StackEmptyException {
		
		  if(head==null){
		        throw new StackEmptyException();
		    }
		    return head.data;
	}
	
	public T pop() throws StackEmptyException {
		
		 if(head==null){
		        throw new StackEmptyException();
		    }
		    //since we are pushing data in the front so the so we must remove the data from the front itself
		    T temp =head.data;
		    head = head.next;
		    size--;
		    return temp;
		
		
	}

}
