package Recursion1;
import java.util.Scanner;
public class FirstIndexofNumberinArray {
	
	public static int[] takeInput(){
		Scanner s =new Scanner(System.in);
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	
	public static int firstIndex(int input[], int x) {
		return ans(input,x,0);
    }
    
    public static int ans(int input[],int x,int startIndex)
    {
      int n=input.length;
     
        if(startIndex==n)
        {
            return -1;
        }
        if(x==input[startIndex])
        {
            return startIndex;
        }
        return ans(input,x,startIndex+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(FirstIndexofNumberinArray.firstIndex(input, x));

	}

}
