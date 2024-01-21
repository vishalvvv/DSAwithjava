package arrays2d;
import java.util.Scanner;

public class ResetMatrix {
	
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int m = scanner.nextInt();
	        int n = scanner.nextInt();
	        
	        int[][] matrix = new int[m][n];
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                matrix[i][j] = scanner.nextInt();
	            }
	        }
	        
	        setZeroes(matrix);
	        
	        // Print the modified matrix
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	    
	    public static void setZeroes(int[][] matrix) {
	        int m = matrix.length;
	        int n = matrix[0].length;
	        
	        boolean firstRowHasZero = false;
	        boolean firstColHasZero = false;
	        
	        // Check if the first row has a zero
	        for (int j = 0; j < n; j++) {
	            if (matrix[0][j] == 0) {
	                firstRowHasZero = true;
	                break;
	            }
	        }
	        
	        // Check if the first column has a zero
	        for (int i = 0; i < m; i++) {
	            if (matrix[i][0] == 0) {
	                firstColHasZero = true;
	                break;
	            }
	        }
	        
	        // Mark zeros in the first row and column
	        for (int i = 1; i < m; i++) {
	            for (int j = 1; j < n; j++) {
	                if (matrix[i][j] == 0) {
	                    matrix[i][0] = 0;
	                    matrix[0][j] = 0;
	                }
	            }
	        }
	        
	        // Set the zeros based on the first row and column markers
	        for (int i = 1; i < m; i++) {
	            for (int j = 1; j < n; j++) {
	                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
	                    matrix[i][j] = 0;
	                }
	            }
	        }
	        
	        // Set zeros for the first row if needed
	        if (firstRowHasZero) {
	            for (int j = 0; j < n; j++) {
	                matrix[0][j] = 0;
	            }
	        }
	        
	        // Set zeros for the first column if needed
	        if (firstColHasZero) {
	            for (int i = 0; i < m; i++) {
	                matrix[i][0] = 0;
	            }
	        }
	    }
	
	 
	

}
