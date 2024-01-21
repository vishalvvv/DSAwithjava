package linkedlist2;

public class EvenafterOddLL {
	
	 
                  
         
  
	public static Node<Integer> evenAfterOdd(Node<Integer> head) {
		 if (head==null || head.next==null)
       {
           return head;
       }
       Node<Integer> node=head,evenNode=null,oddNode=null,oddHead=null,evenHead=null;
       while(node!=null)
       {            
           int data=node.data;
           //System.out.println(data);
           
           if (data%2==0)
       	{
               //System.out.println(data+" is divisble by 2");
               if (evenNode==null)
               {
                   //System.out.println("Adding first node");
                   evenNode=node;
                   evenHead=node;
               }
               else
               {
                   evenNode.next=node;
               	evenNode=evenNode.next;
               }
               //System.out.println("Even numbers");
       		//Runner.print(evenHead);
           	
       	}
       	else
       	{
               //System.out.println(data+" is not divisble by 2");
               if (oddNode==null)
               {
                   //System.out.println("Adding first node");
                   oddNode=node;
                   oddHead=node;
               }
               else
               {
                   oddNode.next=node;
               	oddNode=oddNode.next;
               }
               //System.out.println("Odd numbers");
           	//Runner.print(oddHead);
           	
       	}
           
           //System.out.println();
           node=node.next;
       }
       //Runner.print(oddHead);
       //Runner.print(evenHead);
       if (oddHead==null)
       {
           return evenHead;
       }
       else
       {
           oddNode.next=evenHead;
       }
       
       if (evenNode!=null)
       {
           evenNode.next=null;
       }
       
       
       return oddHead;
       
	}
	 public static void printLinkedList(Node<Integer> head) {
	        Node<Integer> temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	
	
   public  static void main(String[] args) {
		// TODO Auto-generated method stub
	   Node<Integer> head = new Node<>(1);
       head.next = new Node<>(2);
       head.next.next = new Node<>(3);
       head.next.next.next = new Node<>(4);
       head.next.next.next.next = new Node<>(5);

       System.out.println("Original Linked List:");
       printLinkedList(head);

       // Rearrange the linked list to have even numbers after odd numbers
       Node<Integer> rearrangedHead = evenAfterOdd(head);

       System.out.println("Rearranged Linked List:");
       printLinkedList(rearrangedHead);

	}

   }

