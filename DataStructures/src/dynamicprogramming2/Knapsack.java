package dynamicprogramming2;

public class Knapsack {
	
	public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
		//Your code goes here
        
        int[][] dp = new int[n+1][maxWeight+1];
		
		for (int i=n-1;i>=0;i--)
		{
			for (int w=0;w<=maxWeight;w++)
			{
				if (weights[i]<=w)
				{
					int ans1=dp[i+1][w];
					int ans2=dp[i+1][w-weights[i]] + values[i];
					dp[i][w]=Math.max(ans1, ans2);
				}
				else
				{
					dp[i][w]=dp[i+1][w];
				}
			}
		}
		return dp[0][maxWeight];
        
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] weights = {12,7,11,8,9};
	    int[] values = {24,13,23,15,16};
	    int n = weights.length;
	    int maxWeight = 26;

	    int maxValue = knapsack(weights, values, n, maxWeight);
	    System.out.println("Maximum Value: " + maxValue);
	
		
	}

}
