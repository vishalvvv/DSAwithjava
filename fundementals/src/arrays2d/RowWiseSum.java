package arrays2d;

public class RowWiseSum {
	
	public static void rowWiseSum(int[][] mat) {
		//Your code goes here
		if(mat.length==0){
			return;
		}
		for(int i=0;i<mat.length;i++){
			int sum=0;
			for(int j=0;j<mat[0].length;j++ ){
				sum=sum+mat[i][j];
			}
			System.out.print(sum+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[][] mat = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };

		        rowWiseSum(mat);
		
	}

}
