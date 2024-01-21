package arrays;
import java.util.Scanner;
public class Sort01 {
	
	public static int[] takeInput(){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		arr[i]=s.nextInt();
		}
		return arr;
		}


public static void printArray(int[] arr) {
for (int element : arr) {
System.out.print(element + " ");
}

System.out.println();
}
	
	public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int i=0;
        int j=arr.length-1;
        while(i<j){
            while(arr[i]%2==0 && i<j){
                i++;
            }
            while(arr[j]%2==1 && i<j){
                j--;
            }
            if(i<j){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[] = takeInput();
       sortZeroesAndOne(arr);
       printArray(arr);
       
}
	}


