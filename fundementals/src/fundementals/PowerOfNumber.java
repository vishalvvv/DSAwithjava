package fundementals;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int ans=1;

int x = s.nextInt();
int n = s.nextInt();
while(n>0) {
	ans=ans*x;
	n=n-1;
	
}
System.out.println(ans);

	}

}
