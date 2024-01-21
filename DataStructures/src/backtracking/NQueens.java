package backtracking;

public class NQueens {
	
	public static void placeNQueens(int n) {
		int board[][] = new int[n][n];
		placeQueens(board,n,0);
	}
	
	private static void placeQueens(int[][] board,int n,int row) {
	if(row == n) {
		
		 // If we have placed all N queens, print the solution.
        printSolution(board, n);
        return;
		}
	
	  for (int col = 0; col < n; col++) {
          if (isSafe(board, n, row, col)) {
              board[row][col] = 1; // Place the queen in the current cell.

              // Move to the next row and continue with the backtracking.
              placeQueens(board, n, row + 1);

              board[row][col] = 0; // Backtrack by removing the queen from the current cell.
          }
      }
	
	  
}
	
	
	 private static boolean isSafe(int[][] board, int n, int row, int col) {
	        // Check if there is a queen in the same column or diagonals.
	        for (int i = 0; i < row; i++) {
	            if (board[i][col] == 1) {
	                return false;
	            }
	            if (col - (row - i) >= 0 && board[i][col - (row - i)] == 1) {
	                return false;
	            }
	            if (col + (row - i) < n && board[i][col + (row - i)] == 1) {
	                return false;
	            }
	        }
	        return true;
	    }

	    private static void printSolution(int[][] board, int n) {
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(board[i][j] == 1 ? "Q " : "- ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int n = 4; // Change 'n' to the desired board size.
	        placeNQueens(n);
		
	}

	}
