package arrays;

import java.util.Scanner;

public class LinearSearch {
	
public static int linearSearch(int arr[]) {
	int x=3;
		  for(int i=0;i<arr.length;i++){
		      if(arr[i]==x){
		        return i;
		      }
		  }
		  return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
     int arr[]= {2,13,4,1,3,6,28};
		
    int result= linearSearch(arr);
    System.out.println(result);
	}


}
