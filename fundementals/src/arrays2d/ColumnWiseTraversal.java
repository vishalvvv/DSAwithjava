package arrays2d;

public class ColumnWiseTraversal {
	
    public static int[] printColWise(int [][]a) {
        // Write your code here.
           int n = a.length;
        int m = a[0].length;
        int[] result = new int[n*m];
        int index = 0;
        for (int j = 0; j< m; j++) {
            for (int i = 0; i< n; i++) {
                result[index++] = a[i][j];
            }
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[][] a = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };

		        int[] result = printColWise(a);
		        for (int i = 0; i < result.length; i++) {
		            System.out.print(result[i] + " ");
		        }
	}

}
