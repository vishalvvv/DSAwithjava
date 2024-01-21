package fundementals;

import java.util.Scanner;

public class Pattern4L {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		while(i<=n) {
			int valueToPrint = (2*i-1);
			int maxValue = (2*n-1);
			int j=1;
			while(j<=n) {
				System.out.print(valueToPrint);
				valueToPrint = valueToPrint+2;
				if(valueToPrint>maxValue) {
					valueToPrint =1;
				}
				j=j+1;
			}
			
			System.out.println();
			i=i+1;
		}
		
		

	}

}
