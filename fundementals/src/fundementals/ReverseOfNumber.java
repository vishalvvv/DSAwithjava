package fundementals;
import java.util.Scanner;
public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
		 int revNum =0;
		 while(n>0) {
			 int lastDigit = n%10;
			 n=n/10;
			 revNum = revNum*10+lastDigit;
		 }
		 System.out.println(revNum);
	}

}
