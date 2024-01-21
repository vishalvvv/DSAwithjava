package fundementals;

import java.util.Scanner;

public class Pattern4K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int sum=0;
		int i=1;
		while(i<=n) {
			sum=sum+i;
			int j=1;
			while(j<=i) {
				System.out.print(j);
				if(j==i) {
					System.out.print("=");
				}
				else {
					System.out.print("+");
				}
				j=j+1;
			}
			System.out.println(sum);
			i=i+1;
		}

	}

}
