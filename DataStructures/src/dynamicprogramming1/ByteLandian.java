package dynamicprogramming1;
import java.util.HashMap;
public class ByteLandian {
	
	public static long bytelandian(long n, HashMap<Long, Long> memo) {
        // Write your code here

		if(n<=3){
			return n;
		}
		
		long total=0;
		if(memo.containsKey(n/2)){
			total+=memo.get(n/2);
		}else
			total+=bytelandian(n/2,memo);
		
		if(memo.containsKey(n/3))
			total+=memo.get(n/3);
		else
			total+=bytelandian(n/3,memo);

		if(memo.containsKey(n/4))
			total+=memo.get(n/4);
		else
			total+=bytelandian(n/4,memo);

		if(total>n)
			memo.put(n,total);
		else
			memo.put(n,n);
		
		return memo.get(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Long, Long> memo = new HashMap<>();
		
		long n = 12; // Change this to test with different values
		long maxAmount = bytelandian(n, memo);
		
		System.out.println("Maximum amount for exchanging " + n + " ByteCoins: " + maxAmount);

	}

}
