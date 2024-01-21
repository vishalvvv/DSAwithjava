package Recursion1;

public class FirstIndexofnumberinarrayex {
	
	//brute force
	
	 public static int firstIndex(int a[],int x){
	        if(a.length==0){
	            return -1;
	        }
	        if(a[0]==x){
	            return 0;
	        }
	        int smallArray[]=new int[a.length-1];
	        for(int i=1;i<a.length;i++){
	            smallArray[i-1]=a[i];
	        }
	        int fi=firstIndex(smallArray,x);
	        if(fi==-1){
	            return -1;
	        }else{
	            return fi+1;
	        }
	        
	        
	    }
	 
	 // optimised
	    public static int firstIndexBetter(int a[],int x,int si){
	        if(si==a.length){
	            return -1;
	        }
	        if(a[si]==x){
	            return si;
	        }
	        int k=firstIndexBetter(a,x,si+1);
	        return k;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 3, 5, 3, 2, 4, 3};
	        int target = 3;

	        int firstIndex = firstIndex(arr, target);
	        int firstIndexOptimal = firstIndexBetter(arr, target, 0);

	        System.out.println("First index of " + target + " (using firstIndex): " + firstIndex);
	        System.out.println("First index of " + target + " (using firstIndexBetter): " + firstIndexOptimal);
	}

}
