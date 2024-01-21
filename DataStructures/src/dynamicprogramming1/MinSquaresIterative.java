package dynamicprogramming1;

public class MinSquaresIterative {
	
	public static int minSquaresI(int n) {
		int dp[] = new int[n+1];
		dp[0] = 0;
		for(int i=1;i<=n;i++) {
		int minAns= Integer.MAX_VALUE;
		for(int j=1;j*j<=i;j++) {
		int currAns = dp[i-(j*j)];
		if(minAns > currAns) {
		minAns = currAns;
		}
		}
		dp[i] = 1+ minAns;
		}
		return dp[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=41;
		int ans = minSquaresI(n);
		System.out.println(ans);
		
	}

}
