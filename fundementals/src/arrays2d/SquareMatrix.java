package arrays2d;
import java.util.Arrays;

	
	class Pair<T, U> {
	    private T first;
	    private U second;

	    public Pair(T first, U second) {
	        this.first = first;
	        this.second = second;
	    }

	    public T getFirst() {
	        return first;
	    }

	    public U getSecond() {
	        return second;
	    }
	}

	public class SquareMatrix {
	    
	    public static Pair<String, int[]> sqrMat(int[][] mat, int n, int m) {
	        String ans = "NO";
	        int[] arr = new int[0];

	        if (n != m) {
	        	  return new Pair<>(ans, arr);
	        }

	        arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = mat[i][i];
	        }

	        return new Pair<>("YES", arr);
	    }


	    public static void main(String[] args) {
	        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	        int n = arr.length;
	        int m = arr[0].length;
	        Pair<String, int[]> result = sqrMat(arr, n, m);
	        String ans = result.getFirst();
	        int[] diagonal = result.getSecond();
	        System.out.println(ans);
	        System.out.println(Arrays.toString(diagonal));
	    }
	}
	






	
	


