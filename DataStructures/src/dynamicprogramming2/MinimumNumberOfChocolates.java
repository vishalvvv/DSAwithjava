package dynamicprogramming2;

public class MinimumNumberOfChocolates {
	
public static int getMin(int arr[], int N){
        
        
        
        int dp[]=new int[N+1];
        dp[0]=1;
        int i=0;
        int sum=0;
        for(i=1; i<N;i++)
        {
            if(arr[i]>arr[i-1])
            {
                dp[i]=dp[i-1]+1;
            }
            else
                dp[i]=1;
        }
        for(i=N-2;i>=0;i--)
        {
            if(arr[i]>arr[i+1] && dp[i]<=dp[i+1])
            {
                dp[i]=dp[i+1]+1;
            }
        }
        for(i=0;i<N;i++)
            sum+=dp[i];
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] rankings = {8,7,5};

		    int minChocolates = getMin(rankings, rankings.length);
		    System.out.println("Minimum number of chocolates required: " + minChocolates);
		}

	}


