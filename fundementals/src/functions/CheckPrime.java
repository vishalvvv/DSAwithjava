package functions;

import java.util.Scanner;

public class CheckPrime {
	public static boolean checkPrime(int n) {
	
	int div=2;
	//boolean isPrime = true
	
	while(div<=n/2) {
		if(n % div==0) {
			// not prime
			return false;
			
		}
		div = div+1;
	}
	return true;
	}
	
	 public static boolean checkPrime2(int n) {
		
	int  div=2;
		boolean isPrime = true;
		
		while(div<=n/2) {
			if(n % div==0) {
				// not prime
		    isPrime =false;
		    break;
				
			}
			div = div+1;
		}
	//	if(isPrime) {
	//		return true;
	//	}
	//	else {
	//		return false;
	//		}
	return isPrime;
		}
	
	
//System.out.println("prime");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		boolean isPrime = checkPrime2(n);
		System.out.println(isPrime);

	}

}
