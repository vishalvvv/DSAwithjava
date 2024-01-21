package arrays;
import java.util.Scanner;
public class ArrangeNumbersInArray {
	
	public static void printArray(int arr[]) {
		for(int element:arr) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	
	  public static void arrangeNumbers(int[] arr, int n) {
	    	//Your code goes here
	        int left=0,right=n-1,count=1;
	        while(left<=right){
	            if(count%2==1){
	                arr[left]=count;
	                count=count+1;
	                left=left+1;
	            }
	            else{
	                arr[right]=count;
	                count=count+1;
	                right=right-1;
	            }
	        }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int arr[]=new int[n];
		arrangeNumbers(arr,n);
		printArray(arr);
		

	}

}
