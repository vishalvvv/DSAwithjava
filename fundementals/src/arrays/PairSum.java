package arrays;

import java.util.Scanner;

public class PairSum {
	
	public static int pairSum(int arr[],int x) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==x) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int arr[]= takeInput();
		int x=s.nextInt();
	System.out.println(pairSum(arr,x));
	

	}

}
