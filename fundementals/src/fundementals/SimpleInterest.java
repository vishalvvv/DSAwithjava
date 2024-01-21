package fundementals;
import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
		float si,p,t,r;

		System.out.println("enter the value of p,t,r");
		Scanner sc = new Scanner(System.in);
		p=sc.nextFloat();
		t=sc.nextFloat();
		r=sc.nextFloat();
		
		si=(p*t*r)/100;
		System.out.println("the vale of si is"+si);
		
		}
	}

