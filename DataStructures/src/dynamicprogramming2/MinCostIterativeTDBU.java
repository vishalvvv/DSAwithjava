package dynamicprogramming2;

public class MinCostIterativeTDBU {
	
	 public static int minCostIterativeTD(int[][] cost, int n, int m) {
		 
		  int[][] dp = new int[n + 1][m + 1];
	        
	        for (int i = 0; i <= n; i++) {
	            for (int j = 0; j <= m; j++) {
	                dp[i][j] = Integer.MAX_VALUE;
	            }
	        }
	        
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= m; j++) {
	                if (i == 1 && j == 1) {
	                    dp[i][j] = cost[0][0];
	                } else {
	                    int ans1 = dp[i - 1][j];
	                    int ans2 = dp[i][j - 1];
	                    int ans3 = dp[i - 1][j - 1];
	                    dp[i][j] = cost[i - 1][j - 1] + Math.min(ans1, Math.min(ans2, ans3));
	                }
	            }
	        }
	        
	        return dp[n][m];
	    }

	    public static int minCostIterativeBU(int[][] cost, int n, int m) {
	        int[][] dp = new int[n + 1][m + 1];
	        
	        for (int i = n - 1; i >= 0; i--) {
	            for (int j = m - 1; j >= 0; j--) {
	                if (i == n - 1 && j == m - 1) {
	                    dp[i][j] = cost[i][j];
	                } else {
	                    int ans1 = dp[i + 1][j];
	                    int ans2 = dp[i][j + 1];
	                    int ans3 = dp[i + 1][j + 1];
	                    dp[i][j] = cost[i][j] + Math.min(ans1, Math.min(ans2, ans3));
	                }
	            }
	        }
	        
	        return dp[0][0];
		
	    }
	    
	    public static void main(String[] args) {
	    	
	    	  int[][] cost = {{1, 5, 11}, {8, 13, 12}, {2, 3, 7}, {15, 16, 18}};
	          int n = 4;
	          int m = 3;
	          int ans = minCostIterativeTD(cost, n, m);
	          System.out.println(ans);
	     
	    	
	}

}
