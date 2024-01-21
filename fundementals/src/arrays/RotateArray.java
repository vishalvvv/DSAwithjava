package arrays;
import java.util.Arrays;
public class RotateArray {
	
	
	public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int n =arr.length;
        int temp[]=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=0;i<d;i++){
            arr[i+n-d]=temp[i];
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr = {1, 2, 3, 4, 5};
		    int d = 2;

		    System.out.println("Original Array: " + Arrays.toString(arr));

		    rotate(arr, d);

		    System.out.println("Rotated Array: " + Arrays.toString(arr));
	}

}
