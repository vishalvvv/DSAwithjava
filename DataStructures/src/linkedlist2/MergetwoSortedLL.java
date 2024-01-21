package linkedlist2;
import java.util.Scanner;
public class MergetwoSortedLL {
	
	

	class DoubleNode{

	    Node<Integer> head;
	    Node<Integer> tail;
	    DoubleNode(){

	    }

	    DoubleNode(Node<Integer> head, Node<Integer> tail){
	      this.head= head;
	      this.tail= tail;
	    }
	}


	

	  public static void insert(Node<Integer> head, int elem, int pos){
	    Node<Integer> nodeToBeInserted= new Node<Integer>(elem);

	    if(pos==0){
	      nodeToBeInserted.next= head;
	      head= nodeToBeInserted;
	    }else{
	        int count=0;
	        Node<Integer> prev= head;
	        while(count<pos-1 && prev!=null){
	          count++;
	          prev=prev.next;
	        }
	        if(prev!=null){
	            nodeToBeInserted.next= prev.next;
	            prev.next= nodeToBeInserted;
	        }
	    }
	  }

	    public static Node<Integer> takeInput(){
	        Scanner s= new Scanner(System.in);
	        int data = s.nextInt();
	        Node<Integer> head = null,tail=null;
	        while(data != -1){
	          Node<Integer> currentNode= new Node<Integer>(data);
	          if(head==null){
	            head=currentNode;
	            tail=currentNode;
	          }else{
	            //Node<Integer> tail = head;
	          //  while(tail.next!==null){
	          //      tail= tail.next;
	          //  }
	        //    tail.next= currentNode;
	        //  }
	        //  data=s.nextInt();
	        tail.next = currentNode;
	        tail=currentNode;    //tail=tail.next;
	    }
	    data= s.nextInt();
	        }
	        return head;
	        }

	    public static void printRecursive(Node<Integer> head){
	      if(head==null){
	        return ;
	      }
	     
	      System.out.print(head.data+" ");
	      printRecursive(head.next);
	    }

  

	  public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2){
	      Node<Integer> t1= head1, t2= head2;
	      Node<Integer> head= null, tail=null;
	      if(t1.data<= t2.data){
	          head=t1;
	          tail=t1;
	          t1=t1.next;
	      }else{
	        head= t2;
	        tail=t2;
	        t2=t2.next;
	      }
	      while(t1 != null && t2!= null){
	        if(t1.data <= t2.data){
	          tail.next= t1;
	          tail=t1;
	          t1= t1.next;
	        }else{
	        tail.next= t2;
	        tail=t2;
	        t2= t2.next;
	        }
	      }
	      if(t1!= null){
	        tail.next= t1;
	      }else{
	        tail.next=t2;
	      }
	      return head;


	        }


	  public static void main(String[] args){

	      Node<Integer> head1 = takeInput();
	      Node<Integer> head2= takeInput();
	      Node<Integer>  head= merge(head1, head2);
	      printRecursive(head);

 }
	}



