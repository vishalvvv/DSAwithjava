package queues;

public class StackUsingTwoQueues {
	
	class QueueUsingLL {

	     Node front;
	     Node rear;
	    int size=0;
	    private class Node{
	        int data;
	        Node next;

	        Node(int n){
	            data=n;
	            next=null;
	        }
	    }

	    public QueueUsingLL(){
	        this.front=null;
	        this.rear=null;
	    }

	    public int getsize(){
	        return size;
	    }

	    public boolean isEmpty(){
	        return size==0;
	    }

	    public int getFront(){
	       if(size==0)
	           return -1;
	        return this.front.data;
	    }

	    public void enqueue(int element){

	        Node temp = new Node(element);
	        if(this.front==null){
	            this.front=temp;
	            this.rear=temp;
	            this.size++;
	            return;
	        }

	        rear.next=temp;
	        rear=rear.next;
	        size++;
	    }

	    public int dequeue(){
	        if(size==0){
	            return -1;
	        }

	        int data=this.front.data;
	        this.front=front.next;
	        this.size--;
	        return data;
	    }
	}

	public class Stack {

	    //Define the data members
	      QueueUsingLL q1;
	    QueueUsingLL q2;


	    public Stack() {
	        //Implement the Constructor
	         q1=new QueueUsingLL();
	        q2=new QueueUsingLL();
	    }



	    /*----------------- Public Functions of Stack -----------------*/


	    public int getSize() { 
	        //Implement the getSize() function
	         return q1.getsize();
	    }

	    public boolean isEmpty() {
	        //Implement the isEmpty() function
	          return q1.getsize()==0;

	    }

	    public void push(int element) {
	        //Implement the push(element) function
	          q1.enqueue(element);
	    }

	    public int pop() {
	        //Implement the pop() function
	         if(q1.getsize()==0)
	            return -1;

	        while (this.q1.getsize()!=1){
	            q2.enqueue(q1.dequeue());
	        }

	        int val=q1.dequeue();
	        QueueUsingLL q3=q1;
	        q1=q2;
	        q2=q3;
	        return val;
	    }

	    public int top() {
	        //Implement the top() function
	         if(q1.getsize()==0)
	            return -1;
	        while(q1.getsize()!=1){
	            q2.enqueue(q1.dequeue());
	        }
	        int val=q1.getFront();
	        q2.enqueue(q1.dequeue());
	        QueueUsingLL q3=q1;
	        q1=q2;
	        q2=q3;
	        return val;
	    }
	}
	    

}
