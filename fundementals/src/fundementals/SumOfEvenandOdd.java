package fundementals;

import java.util.Scanner;

public class SumOfEvenandOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int evenSum=0,oddSum=0;
		int n=s.nextInt();
		while(n>0) {
			int last=n%10;
			if(n%2==0) {
			evenSum = evenSum+last;
			}
			else {
			oddSum = oddSum+last;
			}
			n=n/10;
		}
		
		System.out.println(evenSum+" "+oddSum);
		

	}

}
