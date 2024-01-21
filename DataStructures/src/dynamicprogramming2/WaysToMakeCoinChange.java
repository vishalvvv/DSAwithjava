package dynamicprogramming2;

public class WaysToMakeCoinChange {
	
	public static int countWaysToMakeChange(int denominations[], int value){
        // Write your code here
        
         int[] dp = new int[value+1];
        dp[0]=1;
        for (int i=0;i<denominations.length;i++)
        {
            for (int j=0;j<=value;j++)
            {
                if (j>=denominations[i])
                {
                    dp[j]=dp[j]+dp[j-denominations[i]];
                }
            }
        }
        return dp[value];
        
	}
	public static void main(String[] args) {
		
		 int[] denominations = {1, 2, 3};
		    int value = 4;

		    int ways = countWaysToMakeChange(denominations, value);
		    System.out.println("Number of ways to make change: " + ways);
	}

}
