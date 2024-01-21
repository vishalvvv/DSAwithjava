package arrays2d;

public class TransposeOfMatrix {
	
	public static int[][] transpose(int m, int n, int[][] mat) {
		// Write your code here
	
	
		int res[][]=new int[n][m];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				res[j][i]=mat[i][j];
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] arr = {{1, 2, 3}, {4, 5, 6}};
		    int[][] result = transpose(arr.length, arr[0].length, arr);
		    for (int[] row : result) {
		        for (int num : row) {
		            System.out.print(num + " ");
		        }
		        System.out.println();
	}

}
}
