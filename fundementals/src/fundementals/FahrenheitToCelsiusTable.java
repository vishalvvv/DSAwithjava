package fundementals;

import java.util.Scanner;

public class FahrenheitToCelsiusTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int S,E,W;
 Scanner s = new Scanner(System.in);
 S =s.nextInt();
 E=s.nextInt();
 W=s.nextInt();
 while(S<=E) {
	 int result = 5*(S-32)/9;
	 System.out.print(S);
	 System.out.print(" ");
	 System.out.println(result);
	 
 
 S=S+W;
 }
 
	}

}
