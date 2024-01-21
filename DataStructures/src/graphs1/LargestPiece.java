package graphs1;
import java.util.Scanner;
public class LargestPiece {
	
	static int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    public static int dfs(int[][] edge, int n) {
        boolean[][] visited = new boolean[n][n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && edge[i][j] == 1) {
                    int ans = max1s(edge, visited, i, j, n);
                    if (max < ans) {
                        max = ans;
                    }
                }
            }
        }
        return max;
    }

    public static int max1s(int[][] edge, boolean[][] visited, int x, int y, int n) {
        int[] X_dir = { 0, 1, -1, 0 };
        int[] Y_dir = { 1, 0, 0, -1 };
        int max = 0;
        visited[x][y] = true;
        for (int i = 0; i < X_dir.length; i++) {
            int a = X_dir[i] + x;
            int b = Y_dir[i] + y;

            if (a >= 0 && b >= 0 && a < n && b < n && edge[a][b] == 1 && !visited[a][b]) {
                int ans = max1s(edge, visited, a, b, n);
                max = max + ans;
            }
        }
        return max + 1;
	
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the grid: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        int[][] edge = new int[n][n];
        System.out.println("Enter the matrix (one row per line, space-separated numbers):");
        for (int i = 0; i < n; i++) {
            String[] row = scanner.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                edge[i][j] = Integer.parseInt(row[j]);
            }
        }

        int result = dfs(edge, n);

        System.out.println("The largest connected component of '1's has a size of: " + result);

		
		
	    }
	}
