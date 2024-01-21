package dynamicprogramming1;

public class MinimumNumberOfSquares {
	
	public static int minCount(int n) {
		//Your code goes here
        
        
         int dp[] = new int[n+1];
        for (int i=0;i<n+1;i++)
            dp[i]=-1;
        
        return minCountHelper(n,dp);
	}
    
    private static int minCountHelper(int n, int[] dp)
    {
        if (n==0)
            return 0;
        
        int minVal = Integer.MAX_VALUE;
        for (int i=1;i*i<=n;i++)
        {
            if (dp[n-(i*i)]==-1)
                dp[n-(i*i)]=minCountHelper(n-(i*i),dp);
            int currVal = dp[n-(i*i)];
            if (currVal<minVal)
                minVal=currVal;
        }
        
        return minVal+1;
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int input = 12; // Change this to test with different values
	        int minSquareCount = minCount(input);
	        System.out.println("Minimum number of squares to sum up to " + input + ": " + minSquareCount);
	    }

	}


