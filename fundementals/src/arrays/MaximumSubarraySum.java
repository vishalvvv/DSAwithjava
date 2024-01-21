package arrays;
import java.util.Scanner;
public class MaximumSubarraySum {
	
    public static int findMaxSubarraySum(int[] array) {
        int maxEndingHere = array[0];
        int maxSoFar = array[0];
        
        for (int i = 1; i < array.length; i++) {
            maxEndingHere = Math.max(array[i], maxEndingHere + array[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        return maxSoFar;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        
        int result = findMaxSubarraySum(array);
        System.out.println(result);
    }

	}


