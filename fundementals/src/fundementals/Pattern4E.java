package fundementals;

import java.util.Scanner;

public class Pattern4E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		while(i<=n) {
			int spaces = 1;
			while(spaces <= n-i) {
				System.out.print(' ');
				spaces = spaces+1;
			}
			int numbers=1;
			while(numbers <= i) {
				System.out.print(numbers);
				numbers = numbers+1;
			}
			int dec = i-1;
			while(dec>=1) {
				System.out.print(dec);
				dec=dec-1;
			}
		
		System.out.println();
		i=i+1;
		}
	}

}
