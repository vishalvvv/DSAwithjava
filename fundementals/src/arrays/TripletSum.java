package arrays;

import java.util.Scanner;

public class TripletSum {
	
	public class tripletSum {
		
		public static int tripletSum(int arr[],int x) {
			int count=0;
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					for(int k=j+1;k<arr.length;k++) {
				
			if(arr[i]+arr[j]+arr[k]==x) {
						count++;
					}
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
	System.out.println(tripletSum(arr,x));
	}
	
	}
	}


