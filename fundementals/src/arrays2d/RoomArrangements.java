package arrays2d;
import java.util.Scanner;
public class RoomArrangements {
	
	 static final int MOD = 998244353;

	    public static void main(String[] args) {
	    	 Scanner scanner = new Scanner(System.in);
	         int T = scanner.nextInt();
	         for (int t = 0; t < T; t++) {
	             int p = scanner.nextInt(); // Number of politicians
	             int q = scanner.nextInt(); // Number of economists
	             int r = scanner.nextInt(); // Number of rooms
	             long result = solve(p, q, r);
	             System.out.println(result);
	         }
	     }

	     static long solve(int p, int q, int r) {
	         long[][][] dp = new long[p + 1][q + 1][r + 1];
	         dp[0][0][0] = 1;

	         for (int i = 0; i <= p; i++) {
	             for (int j = 0; j <= q; j++) {
	                 for (int k = 0; k <= r; k++) {
	                     if (i + j + k > 0) {
	                         if (i > 0 && j > 0) {
	                             dp[i][j][k] = (dp[i][j][k] + dp[i - 1][j][k] * j) % MOD;
	                         }
	                         if (j > 0 && k > 0) {
	                             dp[i][j][k] = (dp[i][j][k] + dp[i][j - 1][k] * k) % MOD;
	                         }
	                         if (k > 0 && i > 0) {
	                             dp[i][j][k] = (dp[i][j][k] + dp[i][j][k - 1] * i) % MOD;
	                         }
	                     }
	                 }
	             }
	         }

	         return dp[p][q][r];
	    }
	}
	






	  
    
        
    
	


