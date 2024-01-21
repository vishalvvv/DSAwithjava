package Recursion1;
import java.util.Scanner;
public class CheckNumberinArray {
	
	public static boolean checkNumber(int input[],int x) {
		if(input.length==1) {
			if(input[0]==x) {
				return true;
			}
			else {
				return false;
			}
		}
		if(input[0]==x) {
			return true;
		}
		int temp[]=new int[input.length-1];
		for(int i=0;i<input.length;i++) {
			temp[i]=input[i+1];
		}
		return checkNumber(temp,x);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(CheckNumberinArray.checkNumber(input, x));
	}

}
