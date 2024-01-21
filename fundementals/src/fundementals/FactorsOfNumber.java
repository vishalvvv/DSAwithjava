package fundementals;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter value of n");
		Scanner s = new Scanner(System.in);
		
		int n= s.nextInt();
		int i=2;
		while(i<n) {
			if(n%i==0) {
				System.out.print(i+" ");
				i=i+1;
			}
			else {
				i=i+1;
			}
			
		}
	
	}

}
