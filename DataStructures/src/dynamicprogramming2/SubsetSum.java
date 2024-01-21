package dynamicprogramming2;

public class SubsetSum {
	
	 static boolean isSubsetPresent(int[] arr, int n, int sum) {

	       

	        boolean[][] dp=new boolean[n+1][sum+1];
	            for(int i=0;i<=n;i++)
	            {
	                dp[i][0]=true;
	            }
	        for(int i=1;i<=sum;i++)
	        {
	            dp[0][i]=false;
	        }
	        for(int i=1;i<=n;i++)
	        {
	            for(int j=1;j<=sum;j++)
	            {
	                if(j<arr[i-1])
	                {
	                    dp[i][j]=dp[i-1][j];
	                }
	                else
	                {
	                    dp[i][j]=dp[i-1][j] || dp[i-1][j-arr[i-1]];
	                }
	            }
	        }
	        boolean result=dp[n][sum];
	        return result;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = { 4, 2,5,6,7};
		    int sum = 14;

		    boolean isSubsetSumPresent = isSubsetPresent(arr, arr.length, sum);
		    System.out.println("Subset with sum " + sum + " is present: " + isSubsetSumPresent);

	}

}
