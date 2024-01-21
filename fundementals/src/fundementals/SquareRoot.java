package fundementals;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int n =s.nextInt();
int output=1;
while(output*output<=n) {
	output=output+1;
}
output=output-1;
System.out.println(output);
	}

}
