package Recursion1;
import java.util.Scanner;
public class SumofArray {
	public static int sum(int input[]) {
	 if(input.length == 1) {
         return input[0];
     }
     int temp[] = new int[input.length - 1];
     
     for(int i=0;i<input.length - 1;i++) {
         temp[i] = input[i+1];
     }
		int ans = sum(temp) + input[0];
     return ans;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(sum(input));
	}

}
