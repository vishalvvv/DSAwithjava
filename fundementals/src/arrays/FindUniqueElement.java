package arrays;

public class FindUniqueElement {
	
	 public static int findUnique(int[] arr){
			//Your code goes here
	    int res=arr[0];
	    for(int i=1;i<arr.length;i++){
	 res = res^arr[i];
	    }
	return res;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {2,3,1,6,3,6,2};
   int result= findUnique(arr);
   System.out.println(result);
	}

}
