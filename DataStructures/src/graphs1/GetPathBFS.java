package graphs1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


public class GetPathBFS {
	
	public static ArrayList<Integer> getPathBFS(int adjMatrix[][], int s, int e){
		Queue<Integer> pendingVertices = new LinkedList<>(); 
		HashMap<Integer, Integer> map = new HashMap<>(); 
		boolean visited[] = new boolean[adjMatrix.length]; 
		visited[s] = true; 
		pendingVertices.add(s); 
		map.put(s, -1); 
		boolean pathFound = false;

		while(!pendingVertices.isEmpty()){
		int currentVertex = pendingVertices.poll(); 
		for(int i = 0; i < adjMatrix.length; i++){ 
		if(adjMatrix[currentVertex][i] == 1 && !visited[i]){
		pendingVertices.add(i); 
		visited[i] = true; 
		map.put(i, currentVertex); 
		if(i == e) {
		// Path found 
		pathFound = true; 
		break;
		}
		}
		}
		}
		if(pathFound){
		ArrayList<Integer> path = new ArrayList<>(); 
		int currentVertex = e; 
		while( currentVertex != -1){
		path.add(currentVertex); 
		int parent = map.get(currentVertex); 
		currentVertex = parent;
		}
		return path;
		}else{
		return null;
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); 
		int n = s.nextInt(); 
		int e = s.nextInt(); 
		int adjMatrix[][] = new int[n][n]; 
		for(int i = 0; i < e; i++){
		int v1 = s.nextInt(); 
		int v2 = s.nextInt(); 
		adjMatrix[v1][v2] = 1; 
		adjMatrix[v2][v1] = 1;
		}
		int source= s.nextInt();
		int end=s.nextInt();
		ArrayList<Integer> path=getPathBFS(adjMatrix,source,end);
		for(Integer i:path){
		System.out.print(i+ " ");
		}

	}

}
