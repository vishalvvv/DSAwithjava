package linkedlist2;

public class FindaNodeinLL {
	public static int findNodeRec(Node<Integer> head, int n) {
    	//Your code goes here
         if (head==null) //Empty linked list
        {
            return -1;
        }
        
        if (head.data.equals(n))
        {
            return 0;
        }
        int smallIndex=findNodeRec(head.next,n);
        if (smallIndex==-1)
        {
            return smallIndex;
        }
        else
        {
            return smallIndex+1;
        }
	}
        
        public static void main(String[] args) {
    		// TODO Auto-generated method stub
        	  Node<Integer> head = new Node<>(5);
              head.next = new Node<>(3);
              head.next.next = new Node<>(8);
              head.next.next.next = new Node<>(2);
              head.next.next.next.next = new Node<>(1);

              // Find a node recursively in the linked list
              int nodeIndex = findNodeRec(head, 8);

              if (nodeIndex != -1) {
                  System.out.println("Node found at index: " + nodeIndex);
              } else {
                  System.out.println("Node not found");
              }

    	}

}
