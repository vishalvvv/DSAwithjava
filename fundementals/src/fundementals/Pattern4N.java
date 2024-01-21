package fundementals;
import java.util.Scanner;
public class Pattern4N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				// Check if current column count is greater than or equal to current row count
				if (j >= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			
	}

}
