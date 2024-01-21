package functions;

// import java.util.Scanner;

public class FibonacciNumber {

	
		// TODO Auto-generated method stub
		public static boolean checkMember(int n){
		if (n==0)
	       {
	            return true;
	        }
	        else
	        {
	            int val1=(5*n*n)-4;
	            int sq1 = (int)Math.sqrt(val1);
	            if (sq1*sq1==val1)
	            {
	                return true;
	            }
	            else
	            {
	                int val2=(5*n*n)+4;
	                int sq2=(int)Math.sqrt(val2);
	                return (sq2*sq2==val2);
	            }
	        }
	        } 
		
		public static void main(String[] args) {
			int n=5;
			
			checkMember(5);
		
	}

	}


