package trees;
import java.util.*;

import queues.QueueEmptyException;
public class NodeHavingSumOfChildrenAndNodeIsMax {
	
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
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		
        
        if(root==null || root.children.size()==0)
            return root;
        
        Queue<TreeNode<Integer>> q=new LinkedList<>();
        TreeNode<Integer> largest=root;
        int sum=0;
        q.add(root);
        while(!q.isEmpty()){
            TreeNode<Integer> n1=q.poll();
            int sum1=n1.data;
            for(TreeNode<Integer> n2:n1.children){
                sum1+=n2.data;
                q.add(n2);
            }
            if(sum1>sum){
                sum=sum1;
                largest=n1;
            }
        }
        return largest;
	}
	

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInput();
		 TreeNode<Integer> nodeWithMaxSum = maxSumNode(root);
		    System.out.println("Node with maximum sum: " + nodeWithMaxSum.data);

	}

}
