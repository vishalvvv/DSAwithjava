package graphs1;
import java.util.Scanner;
public class ThreeCycle {
	public static int solve(boolean[][] graph, int n) {
		
		int count = 0;
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                if (graph[i][j] == true) {

                    for (int k = 0; k < graph.length; k++) {

                        if (k != i && graph[k][j] == true && graph[i][k] == true) {
                            count++;
                        }

                    }

                }
            }
        }
        return count / 6;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		    int n = scanner.nextInt();
		    int m = scanner.nextInt();
		    
		    boolean[][] graph = new boolean[n][n];
		    
		    for (int i = 0; i < m; i++) {
		        int u = scanner.nextInt();
		        int v = scanner.nextInt();
		        graph[u][v] = true;
		        graph[v][u] = true;
		    }
		    
		    int result = solve(graph, n);
		    System.out.println(result);

	}

}
