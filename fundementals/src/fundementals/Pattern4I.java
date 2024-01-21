package fundementals;

import java.util.Scanner;

public class Pattern4I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		System.out.println("*");
		
		// first half
		int i=1;
		while(i<=n) {
			System.out.print("*");
			int numbers=1;
			while(numbers<=i) {
				System.out.print(numbers);
				numbers = numbers+1;
			}
			numbers = numbers-2;
			while(numbers>=1) {
				System.out.print(numbers);
				numbers=numbers-1;
			}
			System.out.print("*");
			System.out.println();
			i=i+1;
		}
		
		
		// second half

		i=1;
		while(i<=n-1) {
			System.out.print("*");
			int numbers=1;
			while(numbers<=n-i) {
				System.out.print(numbers);
				numbers = numbers+1;
			}
			numbers = numbers-2;
			while(numbers>=1) {
				System.out.print(numbers);
				numbers = numbers-1;
			}
			System.out.print("*");
			System.out.println();
			i=i+1;
			
		}
		
		System.out.println("*");
		

	}

}
