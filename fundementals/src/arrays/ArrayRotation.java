package arrays;

import java.util.Scanner;

public class ArrayRotation {
	
	public static void swap(int A[],int l,int r) {
		int temp=A[l];
		A[l]=A[r];
		A[r]=temp;
	}
	
	public static void reversebetween(int A[],int l,int r) {
		r--;
		int len = (r-l)/2;
		for(int i=0;i<=len;i++) {
			swap(A,l,r);
			l++;
			r--;
		}
	}
	
	
	public static void rotateRight(int A[],int n,int x) {
		reversebetween(A,0,n);
		reversebetween(A,0,x);
		reversebetween(A,x,n);
		}
	public static void rotateLeft(int A[],int n,int x) {
		reversebetween(A,0,n);
		reversebetween(A,0,n-x);
		reversebetween(A,n-x,n);
	}
	
	
	public static void rotateArray(int A[],int n,int X,String dir) {
		X=X%n;
		if(X>0 && dir.equals("LEFT")) {
			rotateLeft(A,n,X);
		}
		else if(X>0 && dir.equals("RIGHT")) {
			rotateRight(A,n,X);
		}
		for(int i=0;i<n;i++) {
			System.out.print(A[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int x =s.nextInt();
		String dir = s.next();
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=s.nextInt();
		}
		rotateArray(A,n,x,dir);

	}

}
