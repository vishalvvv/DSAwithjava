package arrays2d;

public class PrintLikeaWave {
	
	public static void wavePrint(int mat[][]){
		//Your code goes here
		int n=mat.length;
		if(n==0){
			return;
		}
		int m=mat[0].length;
		for(int j=0;j<m;j++){
			if(j%2==0){
				for(int i=0;i<n;i++){
					System.out.print(mat[i][j]+" ");
				}
			}
			else {
				for(int i=n-1;i>=0;i--){
					System.out.print(mat[i][j]+" ");
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] mat = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };

		        wavePrint(mat);
	}

}
