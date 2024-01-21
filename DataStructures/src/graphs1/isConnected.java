package graphs1;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class isConnected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
			int v = scanner.nextInt();
			int e = scanner.nextInt();
	        if(v==0){ //this checks for case when the user enters 0 vertex and 0 edges
	            System.out.print("true");
	            return;
	        }
			int[][] edges = new int[v][v];
			for(int i=0;i<e;i++) {
				int sv = scanner.nextInt();
				int ev = scanner.nextInt();
				edges[sv][ev] = 1;
				edges[ev][sv] = 1;
			}
			System.out.println(isConnected(edges,0));
	    }
	    public static boolean isConnected(int[][] edges,int sv) {
	        boolean[] visited = new boolean[edges.length];
	        Queue<Integer> queue = new LinkedList<>();
	        queue.add(sv);
	        visited[sv] = true;
	        while(!queue.isEmpty()) {
	            int front = queue.poll();
	            for(int i=0;i<edges.length;i++) {
	                if(!visited[i] && edges[front][i] ==1) {
	                    queue.add(i);
	                    visited[i]=true;
	                }
	            }
	        }
	        //now loop through visited array if you have any invisited that is false value means graph is not connected
	        for(boolean b : visited) {
	            if(!b) {
	                return false;
	            }
	        }
	        //if all values are true, means graph is connected
	        return true;

	}

}
