package TimeComplexity;

public class SplitArray {
	
	public static boolean splitArray(int input[]) {
		
		return splitArray(input,0,0,0);
	}
    
     public static boolean splitArray(int arr[], int si, int lsum, int rsum) 
	{ 
         
  
    	if (si == arr.length) 
        {
            return lsum == rsum;
        }
         
    	if (arr[si] % 5 == 0)
        {
            lsum += arr[si];
        }
        else if (arr[si] % 3 == 0) 
        {
            rsum += arr[si]; 
        }
        else
        {
            return splitArray(arr,si+1, lsum+arr[si], rsum)  || splitArray(arr,si+1,lsum,rsum+arr[si]);
        }
         
    	return splitArray(arr,si+1,lsum,rsum); 
	} 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] input1 = {1, 2, 3, 4, 5, 10};
		    boolean result1 = splitArray(input1);
		    System.out.println("Result 1: " + result1);
		    
		    int[] input2 = {1, 4, 3};
		    boolean result2 = splitArray(input2);
		    System.out.println("Result 2: " + result2);

	}

}
