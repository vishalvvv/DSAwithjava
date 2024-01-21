package arrays2d;

public class TotalSumOnTheBoundariesAndDiagonals {
	
	public static void totalSum(int[][] mat) {
		//Your code goes here
		int n=mat.length;
		int sum=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==0||i==n-1||j==0||j==n-1||j==i||j==n-i-1){
					sum=sum+mat[i][j];
				}
			}
		}
		System.out.print(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	    totalSum(arr);
	}

}
