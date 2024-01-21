package fundementals;
import java.util.Scanner;
public class PyramidPattern {
	
	  public static void printPyramidPattern(int n) {
	        for (int i = 1; i <= n; i++) {
	            // Print spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            
	            // Print decreasing numbers
	            for (int j = i; j >= 1; j--) {
	                System.out.print(j);
	            }
	            
	            // Print increasing numbers
	            for (int j = 2; j <= i; j++) {
	                System.out.print(j);
	            }
	            
	            System.out.println();
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();
	        
	        printPyramidPattern(N);

	}

}
