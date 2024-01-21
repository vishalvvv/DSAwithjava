package graphs1;

import java.util.Scanner;
public class ConnectingDots {
	
	 int solve(String[] board , int n, int m)
		{
	
	 boolean[][] visited = new boolean[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(!visited[i][j]) {
					if(hasCycle(board,-1,-1,i,j,visited)==1) {
						return 1;
					}
				}
			}
		}
		return 0;
	}
 public static int hasCycle(String[] board, int fromX, int fromY, int i, int j, boolean[][] visited) {
		
		if(visited[i][j]) {
			return 1;
		}
		
		int[] X_dir = {1,0,0,-1};
		int[] Y_dir = {0,1,-1,0};
		visited[i][j] = true;
		for(int l=0;l<X_dir.length;l++) {
			int x = X_dir[l] + i;
			int y = Y_dir[l] + j;
			if( x==fromX && y == fromY ) {
					continue;
			}
				
			if( x>=0 && y>=0 && x<board.length && y<board[x].length() && board[x].charAt(y) == board[i].charAt(j) ) {
				
				
				int ans = hasCycle(board, i, j, x, y, visited);
				if(ans == 1) {
					return 1;
				}
				
			}
			
		}
		return 0;
	}
	
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ConnectingDots solution = new ConnectingDots();
	        Scanner scanner = new Scanner(System.in);


	        int n = scanner.nextInt();
	        int m = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline

	        String[] board = new String[n];
	        for (int i = 0; i < n; i++) {
	            board[i] = scanner.nextLine();
	        }

	        int result = solution.solve(board, n, m);

	        if (result == 1) {
	            System.out.println("true");
	        } else {
	            System.out.println("false");
	        }


	}

}
