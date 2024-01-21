package arrays;

public class ExtraCandies {
	
	 public static int[] extraCandies(int n, int x, int []p1, int []p2) {
	        // Write your code here.
	        long carry=0;
	        int ans[]=new int[n];
	        for(int i=0;i<n;i++){
	            long total=p1[i]+p2[i]+carry;
	            carry=0;
	            if(total<=x){
	                ans[i]=(int)total;
	            }
	            else {
	                carry=total-x;
	                ans[i]=x;
	            }
	        }
	        return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 3;
		    int x = 10;
		    int[] p1 = {5, 3, 7};
		    int[] p2 = {4, 1, 2};

		    int[] result = extraCandies(n, x, p1, p2);

		    for (int i = 0; i < n; i++) {
		        System.out.println("Extra candies for person " + (i + 1) + ": " + result[i]);

	}

}
}