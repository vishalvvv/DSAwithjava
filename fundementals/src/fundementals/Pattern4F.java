package fundementals;

import java.util.Scanner;

public class Pattern4F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		while(i<=n) {
			int spaces=1;
			while(spaces<=n-i) {
				System.out.print(' ');
				spaces = spaces+1;
			}
			int stars = 1;
			while(stars<=2*i-1) {
				System.out.print('*');
				stars=stars+1;
			}
			System.out.println();
			i=i+1;
		}
		
	}

}
