package Recursion1;

public class CheckArraySorted {
	
	
	// brute force solution
    public static boolean isSorted(int a[]){
        if(a.length==1){
            return true;
        }
        if(a[0]>a[1]){
            return false;
        }
        int smallArray[]=new int[a.length-1];
        for(int i=1;i<a.length;i++){
            smallArray[i-1]=a[i];
        }
        boolean isSmallArraySorted=isSorted(smallArray);
        return isSmallArraySorted;
    }
	
    // optimal solution
	 public static boolean isSortedBetter(int a[],int si){
	        if(si==a.length-1){
	            return true;
	        }
	        if(a[si]>a[si+1]){
	            return false;
	        }
	        boolean isSmallArraySorted=isSortedBetter(a,si+1);
	        return isSmallArraySorted;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,6};
 System.out.println(isSorted(arr));
	}

}
