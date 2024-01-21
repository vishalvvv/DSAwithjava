package fundementals;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n;
         Scanner s = new Scanner(System.in);
         n=s.nextInt();
       int div=2;
    boolean   isPrime=true;
       while(div<=n/2) {
    	   if(n%div==0) {
    		   isPrime=false;
    	   }
    	   div = div+1;
       }
    	   if(isPrime==true) {
    		   System.out.println("prime");
    	   }
    	   else {
    		   System.out.println("composite");
    	   }
    	   
       }
	}


