package arrays2d;
import java.util.ArrayList;
import java.util.Arrays;
public class QueryandMatrix {
	
	
	public static ArrayList<Integer> query(ArrayList<ArrayList<Integer>> mat, int m, int n, ArrayList<String> q) {
		// Initializing ArrayList to store answer of query type 2.
		ArrayList<Integer> ans = new ArrayList<Integer>();

		// Iterate for every query.
		for (int i = 0; i < q.size(); i++) {
			// If query is of type 1.
			if (q.get(i).charAt(0) == '1') {
				// If we have to consider row.
				if (q.get(i).charAt(1) == 'R') {

					int index = q.get(i).charAt(2) - 48;
					// Iterate for row at given 'INDEX'.
					for (int k = 0; k < n; k++) {
						mat.get(index).set(k, mat.get(index).get(k) ^ 1);
					}
				}
				// If we have to consider column.
				else {
					int index = q.get(i).charAt(2) - 48;
					// Iterate for row at given 'INDEX'.
					for (int k = 0; k < m; k++) {
						mat.get(k).set(index, mat.get(k).get(index) ^ 1);
					}
				}
			}
			// If query is of type 2.
			else {
				// If we have to consider row.
				if (q.get(i).charAt(1) == 'R') {
					int count = 0;
					int index = q.get(i).charAt(2) - 48;
					for (int k = 0; k < n; k++) {
						if (mat.get(index).get(k) == 0) {
							count = count + 1;
						}
					}
					ans.add(count);
				}
				// If we have to consider column.
				else {
					int count = 0;
					int index = q.get(i).charAt(2) - 48;
					for (int k = 0; k < m; k++) {
						if (mat.get(k).get(index) == 0) {
							count = count + 1;
						}
					}
					ans.add(count);
				}
			}
		}
		// Return answer.
		return ans;
	}

	// public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	 ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
		//    ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(1, 0, 1));
		//    ArrayList<Integer> row2 = new ArrayList<>(Arrays.asList(0, 1, 0));
		//    ArrayList<Integer> row3 = new ArrayList<>(Arrays.asList(1, 0, 1));
		 //   mat.add(row1);
		 //   mat.add(row2);
		 //   mat.add(row3);

		//    int m = mat.size();
		//    int n = mat.get(0).size();

		//    ArrayList<String> queries = new ArrayList<>(Arrays.asList("1RC1", "2CC2", "2RR0"));

		 //   ArrayList<Integer> result = query(mat, m, n, queries);
		//    System.out.println(result);

	// }
	
	 public static void main(String[] args) {
	        // Sample input values
	        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
	        mat.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
	        mat.add(new ArrayList<>(Arrays.asList(0, 1, 0)));
	        mat.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
	        int m = 3; // Number of rows
	        int n = 3; // Number of columns

	        ArrayList<String> q = new ArrayList<>(Arrays.asList("1R0", "2C1", "1R1", "2R2"));
	        ArrayList<Integer> result = query(mat, m, n, q);

	        // Output the result
	        System.out.println("Result: " + result);
	    }

}
