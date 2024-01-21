package graphs1;
import java.util.Scanner;
public class Islands {
public static int numConnected(int[][] edges, int n) {
        
		
		  int count = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(edges, n, i, visited);
                count++;
            }
        }

        return count;
    }

    private static void dfs(int[][] edges, int n, int start, boolean[] visited) {
        visited[start] = true;
        for (int i = 0; i < n; i++) {
            if (edges[start][i] == 1 && !visited[i]) {
                dfs(edges, n, i, visited);
            }
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt(); // Number of nodes
	        int e = scanner.nextInt(); // Number of edges
	        
	        int[][] adjacencyMatrix = new int[n][n]; // Initialize adjacency matrix
	        
	        for (int i = 0; i < e; i++) {
	            int v1 = scanner.nextInt(); // Vertex 1
	            int v2 = scanner.nextInt(); // Vertex 2
	            adjacencyMatrix[v1][v2] = 1;
	            adjacencyMatrix[v2][v1] = 1;
	        }
	        
	        int islands = numConnected(adjacencyMatrix, n);
	        System.out.println(islands);
	        
	        scanner.close();

	}

}
