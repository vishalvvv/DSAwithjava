package linkedlist2;

import java.util.Scanner;

public class DeleteNodeRecursively {
	
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
    
    public static void print(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
	
	public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
    	//Your code goes here
        if(head == null) {
            return head;
        }
        if (pos == 0) {
            return head.next;
        }
        
        Node<Integer> newHead = deleteNodeRec(head.next, pos - 1);
        head.next = newHead;
        return head;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the elements of the linked list (enter -1 to stop):");
        Node<Integer> head = takeInput();

        // Delete a node recursively at a specific position
        System.out.println("Enter the position of the node to delete:");
        Scanner scanner = new Scanner(System.in);
        int pos = scanner.nextInt();
        scanner.close();
        head = deleteNodeRec(head, pos);

        // Print the modified linked list
        System.out.println("Modified linked list:");
        print(head);

	}

}
