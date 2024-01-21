package trees;
import java.util.*;

import queues.QueueEmptyException;
public class PrintTreeLevelwise {
	

    public static TreeNode<Integer> takeInput() throws QueueEmptyException{
        Scanner s= new Scanner(System.in);
        QueueUsingLL<TreeNode<Integer>> pendingNodes= new QueueUsingLL<>();
        System.out.println("Enter the root data ");
        int rootData= s.nextInt();
        if(rootData == -1) {
            return null;
        }

        TreeNode<Integer> root= new TreeNode<Integer>(rootData);
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> front= pendingNodes.dequeue();
            System.out.println("Enter no. of children "+ front.data);
            int numChild= s.nextInt();
           for(int i=0;i<numChild;i++){
                System.out.println("Enter the  "+i+" th child data for:"+ front.data);
           int childData= s.nextInt();
                TreeNode<Integer> childNode= new TreeNode<>(childData);
                front.children.add(childNode);
                pendingNodes.enqueue(childNode);
           }
        }
        return root;
    }
    
    public static void printTree(TreeNode<Integer> root){
        //Special case not base case
        if(root==null){
            return ;
        }
        System.out.print(root.data+": ");
        for(int i=0; i<root.children.size(); i++){
            System.out.print(root.children.get(i).data+ " ");
        }
        System.out.println();
        for(int i=0;i<root.children.size();i++){
            TreeNode<Integer> child= root.children.get(i);
            printTree(child);
        }
 }

	    
	
	
	public static void printLevelWise(TreeNode<Integer> root){
	  Queue<TreeNode<Integer>> q1 = new LinkedList<>();
      q1.add(root);
      while (!q1.isEmpty()){
          int l=q1.size();
          for (int i = 0; i < l; i++) {
              TreeNode<Integer> t1=q1.poll();
              System.out.print(t1.data+" ");
              for (int j = 0; j < t1.children.size(); j++) {
                  q1.add(t1.children.get(j));
              }

          }
          System.out.println();
      }
      }
      

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInput();
	//	printTree(root);
		printLevelWise(root);
		
		

	}

}
