package fundementals;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s = new Scanner(System.in);
 int n =s.nextInt();
 int placeValue=1;
 int ans=0;
 while(n!=0) {
	int lastDigit = n%10;
	 n=n/10;
	  ans = ans+placeValue*lastDigit;
	 placeValue = placeValue*2;
	 
	 
	
 }
 System.out.println(ans);
	}

}
