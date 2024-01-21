package graphs1;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class BreadthFirstSearchTraversal {
	
	public static void bfTraversal(int adjMatrix[][]){
		Queue<Integer> pendingVertices = new LinkedList<>(); 
		boolean visited[] = new boolean[adjMatrix. length]; 
		  for (int startVertex = 0; startVertex < adjMatrix.length; startVertex++) {
	            if (!visited[startVertex]) {
		visited[startVertex] = true; 
		pendingVertices.add(startVertex);
		

		while(! pendingVertices.isEmpty()){
		int currentVertex = pendingVertices.poll(); 
		System.out.print(currentVertex +" "); 
		for(int i = 0; i < adjMatrix.length; i++){ 
		if(adjMatrix[currentVertex][i] == 1 && !visited[i]){
		// i is unvisited neighbor of currentVertex 
		pendingVertices.add(i); 
		visited[i] = true;
	
		  
		}
		}
		}
        System.out.println();

		 
		}
		  }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); 
		int n = s.nextInt(); 
		int e = s.nextInt(); 
		int adjMatrix[][] = new int[n][n]; 
		for(int i = 0; i <e; i++){
		int v1 = s.nextInt(); 
		int v2 = s.nextInt(); 
		adjMatrix[v1][v2] = 1; 
		adjMatrix[v2][v1] = 1;
		}
		
		bfTraversal(adjMatrix); 


	}

}
