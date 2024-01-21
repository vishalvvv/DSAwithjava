package SearchingandSorting;
import java.util.Arrays;
public class FindPairWithSmallestDifference {
	
	  public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {
	        // Write your code here.
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	        int i=0;
	        int j=0;
	        int mini=Integer.MAX_VALUE;
	        while(i<n && j<m){
	            int diff = Math.abs(arr1[i]-arr2[j]);
	            if(diff<mini){
	                mini = diff;
	            }
	            if(arr1[i]<arr2[j]){
	                i++;
	            }
	            else{
	                j++;
	            }
	        }
	        return mini;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr1 = {1, 3, 5, 11, 13};
	        int[] arr2 = {2, 4, 6, 8};

	        int n = arr1.length;
	        int m = arr2.length;

	        int result = smallestDifferencePair(arr1, n, arr2, m);
	        System.out.println("Smallest difference: " + result);
	}

}
