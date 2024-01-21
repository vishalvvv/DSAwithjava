package fundementals;
import java.util.Scanner;

public class NumberStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();
	        
	        printNumberStarPattern(N);

	}
	  public static void printNumberStarPattern(int N) {
	        for (int i = 1; i <= N; i++) {
	            // Print numbers in decreasing order
	            for (int j = 1; j <= N - i + 1; j++) {
	                System.out.print(j);
	            }
	            
	            // Print stars
	            for (int j = 1; j <= 2 * i - 2; j++) {
	                System.out.print("*");
	            }
	            
	            // Print numbers in increasing order
	            for (int j = N - i + 1; j >= 1; j--) {
	                System.out.print(j);
	            }
	            
	            System.out.println();
	        }
	    }

}
