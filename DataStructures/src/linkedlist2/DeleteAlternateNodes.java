package linkedlist2;

public class DeleteAlternateNodes {
	
	   public static void deleteAlternateNodes(Node<Integer> head) {
	        //Your code goes here
	        while(head.next!=null){
	             if(head.next.next!=null){
	             head.next=head.next.next;
	             head=head.next;
	             }else{
	                 head.next=null;
	             }
	        }
	   }
	         

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
