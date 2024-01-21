package linkedlist2;

public class BubbleSortIterative {
	
	public static Node<Integer> bubbleSort(Node<Integer> head) {
		//Your code goes here
        
        if(head==null || head.next==null)
            return head;
        
        Node<Integer> i=head;
        Node<Integer> j=head.next;
        int m=0;
        int n=0;
        while(i.next!=null){
            j=i.next;
            n=m+1;
           while(j!=null){
                if(i.data>j.data){
                    //swap
                    head=swapNodes(head,m,n);
                    Node<Integer> c=j;
                    j=i;
                    i=c;
                }
                j=j.next;
                n++;
           }
        
            i=i.next;
            m++;
            
        }
        return head;
	}
    
    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
		//Your code goes here
        
        if(head==null || head.next==null)
            return head;
        
        if(i==j)
            return head;
        
        int i1=(i<j)?i:j;
        int j1=(i>j)?i:j;
        
        
        Node<Integer> t1 = null;
        Node<Integer> t2 = null;
        int m=0;
        if(i1!=0){
            t1=head;
            while(t1!=null && m<i-1){
                t1=t1.next;
                m++;
            }
        }
        m=0;
        if(j1!=0){
            t2=head;
            while(t2!=null && m<j-1){
                t2= t2.next;
                m++;
            }
        }
        
        if(i1==0 && j1>1){
            //swapping the head
            Node<Integer> h1=head.next;
            Node<Integer> c1=t2.next;
            head.next=c1.next;
            c1.next=h1;
            t2.next=head;
            head=c1;
        }else if(i1==0 && j1==1){
            //swapping head and the next Node
            Node<Integer> c1=t2.next;
            t2.next=c1.next;
            c1.next=t2;
            head=c1;
        }else if(j-i==1){
            
            Node<Integer> c1=t1.next;
            Node<Integer> c2=t2.next;
            t1.next=c2;
            c1.next=c2.next;
            c2.next=c1;
        }else{
            Node<Integer> c1=t1.next;
            Node<Integer> c2=t2.next;
            Node<Integer> n1=c1.next;
            c1.next=c2.next;
            t2.next=c1;
            c2.next=n1;
            t1.next=c2;
        }
        
        return head;
    }
    
    public static void printLinkedList(Node<Integer> head) {
        Node<Integer> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Node<Integer> head = new Node<>(5);
	        head.next = new Node<>(3);
	        head.next.next = new Node<>(8);
	        head.next.next.next = new Node<>(1);
	        head.next.next.next.next = new Node<>(6);

	        System.out.println("Original Linked List:");
	        printLinkedList(head);

	        // Sorting the linked list using bubble sort
	        head = bubbleSort(head);

	        System.out.println("Sorted Linked List:");
	        printLinkedList(head);

	}

}
