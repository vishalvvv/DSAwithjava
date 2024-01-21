package SearchingandSorting;

// import java.util.Scanner; 

public class BinarySearchExample {
	
	
	
	 public static int binarySearch(int[] arr, int x) {
	    	//Your code goes here
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]==x){
	                return i;
	            }
	        }
	        return -1;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner s = new Scanner(System.in);
		int arr[]= {4,2,8,6,3,1};
		int x=8;
		System.out.println(binarySearch(arr,x));
		

	}

}
