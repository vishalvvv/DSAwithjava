package arrays;
import java.util.Scanner;
public class ReverseArrayBetween2Indexes {
	
	public static void swap(int A[],int l,int r) {
		int temp = A[l];
		A[l]=A[r];
		A[r]=temp;
	}
	
	public static void reversebetween(int A[],int n,int l,int r) {
		int len=(r-l)/2;
		for(int i=0;i<len;i++) {
			swap(A,l,r);
			l++;
			r--;
		}
		for(int i=0;i<n;i++) {
			System.out.print(A[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int l=s.nextInt();
		int r =s.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=s.nextInt();
			}
		reversebetween(A,n,l,r);
	}

}
