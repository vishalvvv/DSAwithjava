package fundementals;

import java.util.Scanner;

public class Pattern4G {

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
	int q=i;
	int j=1;
	while(j<=i) {
		System.out.print(q);
		q=q+1;
		j=j+1;
	}
	int dec = i-1;
	int k =q-1;
	while(dec>=1) {
		System.out.print(k-1);
		k=k-1;
		dec=dec-1;
	}

System.out.println();
i=i+1;
}
	
	
	
	
	}
	}



