package Recursion1;

import java.util.Scanner;

public class LastIndexOfNumberInArray {
	
	public static int[] takeInput(){
		Scanner s =new Scanner(System.in);
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	
	public static int lastIndex(int input[], int x) {
	       return lastIndex(input,x,input.length-1);
	    }
	    private static int lastIndex(int input[],int x,int startIndex){
	        if(startIndex<0)
	            return -1;
	        if(input[startIndex]==x)
	            return startIndex;
	        return lastIndex(input,x,startIndex-1);
	        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(LastIndexOfNumberInArray .lastIndex(input, x));

		
	}
	

}
