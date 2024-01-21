package fundementals;
import java.util.Scanner;
public class AllPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=2;i<=n;i++){
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
		if(i%j==0){
			isPrime=false;
			break;
			}
			}

		 if(isPrime==true){
		System.out.println(i);
		}
			}
	}

}
