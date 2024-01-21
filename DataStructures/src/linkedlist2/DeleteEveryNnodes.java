package linkedlist2;

public class DeleteEveryNnodes {

	public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
	 if(head==null)
         return head;
     if(M==0)
         return null;
     if(N==0)
         return head;
     Node<Integer> curr=head,t;
     int count;
     while(curr!=null)
     {
     for(count=1;count<M && curr!=null;count++)
     {
         curr=curr.next;
     }
     if(curr==null)
         return head;
     t=curr.next;
     for(count=1;count<=N && t!=null;count++)
     {
         t=t.next;
     }
     curr.next=t;
     curr=t;}
     return head;
     
}
	
	  public static void printLinkedList(Node<Integer> head) {
	        Node<Integer> temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Node<Integer> head = new Node<>(1);
	        head.next = new Node<>(2);
	        head.next.next = new Node<>(3);
	        head.next.next.next = new Node<>(4);
	        head.next.next.next.next = new Node<>(5);
	        head.next.next.next.next.next = new Node<>(6);
	        head.next.next.next.next.next.next = new Node<>(7);
	        head.next.next.next.next.next.next.next= new Node<>(8);

	        System.out.println("Original Linked List:");
	        printLinkedList(head);

	        // Skip M nodes and delete N nodes
	        int M = 2;
	        int N = 2;
	        Node<Integer> modifiedHead = skipMdeleteN(head, M, N);

	        System.out.println("Modified Linked List:");
	        printLinkedList(modifiedHead);

	}

}
