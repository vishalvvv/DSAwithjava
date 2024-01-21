package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Donuts {
	
	  public static int calculateMaxWeight(int[] weights) {
	        Arrays.sort(weights);
	        
	        int maxWeight = 0;
	        int n = weights.length;
	        
	        for (int i = 0; i < n; i += 4) {
	            maxWeight += weights[i + 1];
	        }
	        
	        return maxWeight;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt();
	        
	        for (int i = 0; i < t; i++) {
	            int n = scanner.nextInt();
	            int[] weights = new int[n];
	            
	            for (int j = 0; j < n; j++) {
	                weights[j] = scanner.nextInt();
	            }
	            
	            int result = calculateMaxWeight(weights);
	            System.out.println(result);
	        }
	    }

	}


