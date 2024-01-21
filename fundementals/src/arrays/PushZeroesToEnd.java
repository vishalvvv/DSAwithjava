package arrays;

import java.util.Scanner;

public class PushZeroesToEnd {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int arr[] = new int[n];
		System.out.println("enter elements of array");
		for(int i=0;i<n;i++) {
	//	System.out.println("enter element of array");
			 arr[i] = s.nextInt();
		 }
		return arr;
	}
	
	
	public static void pushZerosAtEnd(int arr[]) {
		int nonZero=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[nonZero];
				arr[nonZero]=temp;
				nonZero++;
			}
		}
		 
        for(int j = 0; j < arr.length; j++) {
           System.out.print(arr[j] + " ");
        }
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = takeInput();
	//	 int arr[] = {1,0,2,3,0,0,0,2};
		 pushZerosAtEnd(arr);
		 }
	}


