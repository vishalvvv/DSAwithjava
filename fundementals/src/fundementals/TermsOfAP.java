package fundementals;
import java.util.Scanner;

public class TermsOfAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int count = 0;
		int n = 1;
		while(count < x) {
		int term = 3*n + 2 ;
		if(term % 4 != 0) {
		System.out.print(term + " ");
		count++;
		}
		n++;
		}
		
		
	}

}
