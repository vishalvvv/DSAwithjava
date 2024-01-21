package arrays2d;

public class RowWiseTraversal {
	
	  public static int[] printRowWise(int [][]a) {
	        int n = a.length;
	        int m = a[0].length;
	        int[] result = new int[n*m];
	        int index = 0;
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                result[index++] = a[i][j];
	            }
	        }
	        return result;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	    int[] rowWiseArray = printRowWise(arr);
	    
	    // Print the row-wise traversal array
	    for (int i = 0; i < rowWiseArray.length; i++) {
	        System.out.print(rowWiseArray[i] + " ");

	}
	}
}


