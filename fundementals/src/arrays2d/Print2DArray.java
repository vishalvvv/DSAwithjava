package arrays2d;

public class Print2DArray {
	
	public static void print2DArray(int input[][]) {


		 

		// Write your code here
		int n=input.length;
	int m=input[0].length;
		for(int i=0;i<n;i++){

		for(int j=0;j<n-i;j++){
			for(int k=0;k<m;k++){
			System.out.print(input[i][k]+" ");
		}
	System.out.println();
		}
	}

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] input = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };

		        print2DArray(input);
	}

}
