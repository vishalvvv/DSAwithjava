package linkedlist2;
import java.util.Scanner;
public class InsertRecursive {
	

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

	    public static Node<Integer> insertRecursive(Node<Integer> head, int elem, int pos){
	        if(head==null && pos>0){
	          return head;
	        }
	        if(pos==0){
	            Node<Integer> newNode= new Node<>(elem);
	            newNode.next= head;
	            return newNode;
	        }else{
	        head.next= insertRecursive(head.next, elem, pos-1);
	        return head;
	        }
	    }

	  public static void main(String[] args){

	      Node<Integer> head = takeInput();
	      head= insertRecursive(head, 20,2);
	      printRecursive(head);
	      //Node<Integer> n1= new Node<>(10);
	      //System.out.println(length(head));

  }
	}
