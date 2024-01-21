package TimeComplexity;
import java.util.*;
import java.lang.*;

public class MaxProfitOnApp {
	
	 public static int maximumProfit(int budget[]) {
	
    
    Arrays.sort(budget);
    
    
    int ans=Integer.MIN_VALUE;
    int n=budget.length;
    // sort(budget,budget+n);
	for(int i=0;i<n;i++)
	{
    	ans=Math.max(ans,budget[i]*(n-i));
	}
	return ans;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] budget1 = {10, 20, 30, 40, 50};
	    int profit1 = maximumProfit(budget1);
	    System.out.println("Maximum Profit 1: " + profit1);
	    
	    int[] budget2 = {5, 8, 2, 15, 10};
	    int profit2 = maximumProfit(budget2);
	    System.out.println("Maximum Profit 2: " + profit2);

	}

}
