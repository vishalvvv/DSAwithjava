package TimeComplexity;
import java.util.*;
public class RotateArray {
	  public static void rotate(int[] arr, int d) {
	    	//Your code goes here
	          int[] tempArr = new int[arr.length];
	        int k =0;
	        for(int i=d;i<arr.length;i++) {
	            tempArr[k] = arr[i];
	            k++;
	        }
	        for(int i=0;i<d;i++) {
	            tempArr[k] = arr[i];
	            k++;
	        }
	        
	        for(int i=0;i<tempArr.length;i++) {
	            arr[i] = tempArr[i];
	        
	        }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		int d=2;
		rotate(arr,d);
		 for (int i = 0; i < arr.length; i++) {
		        System.out.print(arr[i] + " ");
		 }

	}

}
