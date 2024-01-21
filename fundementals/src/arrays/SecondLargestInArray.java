package arrays;

public class SecondLargestInArray {
	
	  public static int secondLargestElement(int[] arr) {
	    	//Your code goes here
	        if(arr.length==0){
	            return Integer.MIN_VALUE;
	        }
	        int largest=arr[0];
	        int secondLargestElement=Integer.MIN_VALUE;
	        for(int i=1;i<arr.length;i++){
	            if(largest<arr[i]){
	                secondLargestElement=largest;
	     largest=arr[i];
	            }
	            else if(secondLargestElement<arr[i]&&arr[i]!=largest){
	                secondLargestElement=arr[i];
	            }
	        }
	        return secondLargestElement;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 8, 2, 10, 7};
	    int secondLargest = secondLargestElement(arr);

	    System.out.println("Second Largest Element: " + secondLargest);

	}

}
