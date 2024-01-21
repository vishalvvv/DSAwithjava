package binarysearchtrees2;



public class DeleteInBST {
	public BinaryTreeNode<Integer> root;
	public int size;

	  public static int minimum(BinaryTreeNode<Integer> root){
	        if(root==null){
	            return Integer.MAX_VALUE;
	        }
	        int minLeft= minimum(root.left);
	        int minRight= minimum(root.right);
	        return Math.min(root.data, Math.min(minLeft, minRight));
	    }
	
	
	public static BSTDeleteReturn deleteDataHelper(BinaryTreeNode<Integer> root,int x) {
		if(root == null) {
			return new BSTDeleteReturn(null,false);
		}
		
		if(root.data < x ) {
			BSTDeleteReturn outputRight = deleteDataHelper(root.right,x);
			root.right=outputRight.root;
	 		outputRight.root=root;
			return outputRight;
		}
		if(root.data > x ) {
			BSTDeleteReturn outputLeft = deleteDataHelper(root.left,x);
			root.left=outputLeft.root;
			outputLeft.root=root;
			return outputLeft;
		}
		

        //0 children
        if(root.left == null && root.right==null) {
            return new BSTDeleteReturn(null, true);
        }

		
		 //only left child
        if(root.left != null && root.right==null) {
            return new BSTDeleteReturn(root.left, true);
        }

        //only right child
        if(root.left == null && root.right!=null) {
            return new BSTDeleteReturn(root.right, true);

	}
	
	
	  //both children present
    int rightMin=  minimum(root.right);
    root.data= rightMin;
    BSTDeleteReturn outputRight= deleteDataHelper(root.right, rightMin);
    root.right= outputRight.root;
    return new BSTDeleteReturn(root.right, true);
}
	
	
	
	public boolean deleteData(int x) {
		BSTDeleteReturn output = deleteDataHelper(root,x);
		root = output.root;
		if(output.deleted) {
			size--;
			
		}
		return output.deleted;
		
	}
	
	
	

    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
