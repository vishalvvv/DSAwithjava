package linkedlist;

import java.util.Scanner;

public class InsertNodeinLL {
// public static Node<Integer> insert(Node<Integer> head, int pos, int data){
		
		//Your code goes here
		//  int index = 0;
      //  Node<Integer> temp = head;
     //   while(temp != null && index < pos - 1) {
     //       temp = temp.next;
      //      index++;
     //   }
        // System.out.println(index + " " + pos);
     //   if(temp != null) {
         
     //   Node<Integer> newNode = new Node<Integer>(data);
      //  if(pos == 0) {
       //     newNode.next = temp;
       //     head = newNode;
     //   } else {
       //  newNode.next = temp.next;
      //  temp.next = newNode;   
     //   }
     //   }
     //   return head;
        // 
// }

    public static void print(Node<Integer> head) {
		
		 Node<Integer> temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	
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
	        
	          
	           tail.next= currentNode;
	           tail=currentNode;
	          }
	          data=s.nextInt();
	        }
	        return head;
	  }
	
	
	public static Node<Integer> insert(Node<Integer> head,int elem,int pos) {
		Node<Integer> nodeToBeInserted = new Node<Integer>(elem);
		
		// code for position not equal to 0
		// if pos==0
		if(pos==0) {
			nodeToBeInserted.next=head;
		//	head=nodeToBeInserted;
			return nodeToBeInserted;
		}
			else {
				
			int count=0;
		
		Node<Integer>prev=head;
		while(count<pos-1 && prev!=null) {
			count++;
			prev=prev.next;
		}
		if(prev!=null) {
		nodeToBeInserted.next=prev.next;
		prev.next=nodeToBeInserted;
		}
		return head;
			}
		
	}
	
	

	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		head=insert(head,80,0);
		print(head);

	}

}
