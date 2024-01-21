package Recursion1;

public class FirstNNaturalnumbers {
	
	public class Recursion{
	    public static int fact(int n){
	        if(n==0){
	            return 1;
	        }
	        int smallOutput=fact(n-1);
	        int output=n*smallOutput;
	        return output;
	        
	    }
	
	        
	    }
	    public static void print1ton(int n){
	        if(n==0){
	            return;
	        }
	       
	        print1ton(n-1);
	        System.out.println(n);
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 print1ton(10);
	}

}
	

