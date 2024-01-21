package graphs1;
import java.util.ArrayList;
import java.util.Scanner;

public class GetPathDFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        Scanner s = new Scanner(System.in);
	        int V = s.nextInt(); //here V is the no. of vertices
	        int E = s.nextInt(); //here E is the no. of edges
	        int edges[][]=new int[V][V]; //we have created an adjacency matrix of v*v 
	        //taking input for the graph, loop through the edges
	        for(int i=0;i<E;i++){
	            int sv=s.nextInt();
	            int ev=s.nextInt();
	            edges[sv][ev]=1; //this works only in a undirected graph
	            edges[ev][sv]=1;
	        }
	        int V1=s.nextInt(); //the source from where you need to find the path
	        int V2=s.nextInt(); //the destination to which you need to find the path
	        boolean visited[]=new boolean[V]; //create a boolean Array of size V
	        ArrayList<Integer> ans=getPathDFS(edges,visited,V1,V2);
	        if(ans!=null){
	        for(int elem:ans)
	        {
	            System.out.print(elem+" ");
	        }
	    }
	      
	    }
		 public static ArrayList<Integer> getPathDFS(int[][] edges,boolean[] visited,int V1,int V2){
	        if(V1==V2) //if start and end are same add start to the answer and return 
	        {
	            ArrayList<Integer> ans=new ArrayList<>();
	            visited[V1]=true;
	            ans.add(V1);
	            return ans;
	        }
	        visited[V1]=true;
	        for(int i=0;i<edges.length;i++)
	        {
	            if(edges[V1][i]==1 && !visited[i])
	            {   //here we are calling recursion for children of start to end.
	                ArrayList<Integer> arr=getPathDFS(edges,visited,i,V2); 
	                if(arr!=null)
	                {
	                    arr.add(V1);

	                    return arr;
	                }
	            }
	        }
	        //if no naswer is found return null 
	        return null;

	}

}
