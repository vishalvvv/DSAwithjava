package arrays2d;
import java.util.Scanner;

public class ModuloProduct {
	
	 static long modPow(long base, long exp, long mod) {
	        long result = 1;
	        while (exp > 0) {
	            if (exp % 2 == 1) {
	                result = (result * base) % mod;
	            }
	            base = (base * base) % mod;
	            exp /= 2;
	        }
	        return result;
	    }

	    // Function to calculate modular inverse
	    static long modInverse(long num, long mod) {
	        return modPow(num, mod - 2, mod);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  // Number of test cases

        while (t-- > 0) {
            long a = scanner.nextLong();  // A
            long b = scanner.nextLong();  // B

            long result = 1;
            for (long i = 1; i <= a; i++) {
                result = (result * i) % b;
            }

            System.out.println(result);
        }

	}

}
