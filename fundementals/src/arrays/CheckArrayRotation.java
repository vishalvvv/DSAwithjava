package arrays;

public class CheckArrayRotation {
	
	   public static int arrayRotateCheck(int[] arr){
	    	//Your code goes here
	        for(int i=0;i<arr.length-1;i++) {
	            if(arr[i]>arr[i+1]){
	                return i+1;
	            }
	        }
	        return 0;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 5, 6, 7, 1, 2, 3};
	    int rotationIndex = arrayRotateCheck(arr);
	    System.out.println("Array is rotated at index: " + rotationIndex);

	}

}
