package functions;

import java.util.Scanner;

public class GCDorHCF {
	public static int findGcd(int x, int y) {
	    int gcd = 1;
	    for(int i = 1; i <= x && i <= y; ++i) {
	        if(x%i==0 && y%i==0) {
	            gcd = i;
	        }
	    }
	    return gcd;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		// int n =s.nextInt();
		int x =s.nextInt();
		int y =s.nextInt();
		int result=findGcd(x,y);
		System.out.println(result);
	
		// TODO Auto-generated method stub

	}

}
