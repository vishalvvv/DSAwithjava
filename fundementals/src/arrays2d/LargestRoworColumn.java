package arrays2d;

public class LargestRoworColumn {

	public static void findLargest(int mat[][]){
		//Your code goes here
		int row_max=Integer.MIN_VALUE;
		int col_max=Integer.MIN_VALUE;
		int row=0;
		int col=0;

		for(int i=0;i<mat.length;i++){
			int sum=0;
			for(int j=0;j<mat[0].length;j++){
				sum=sum+mat[i][j];
			}
			if(sum>row_max){
				row_max=sum;
				row=i;
			}
		}
if(mat.length>0){
	for(int i=0;i<mat[0].length;i++){
		int sum=0;
		for(int j=0;j<mat.length;j++){
			sum=sum+mat[j][i];
		}
		if(sum>col_max){
			col_max=sum;
			col=i;
		}
	}
}
if(col_max>row_max){
	System.out.println("column"+" "+col+" "+col_max);
}
else {
	System.out.println("row"+" "+row+" "+row_max);
}

	}


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] mat = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };

		        findLargest(mat);
	}

}
