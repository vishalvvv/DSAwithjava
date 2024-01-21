package Recursion3;
import java.util.Arrays;
public class GetAllUniqueSubsets {
	public static void printSubsets(int input[]) {
		
		/*
		// Write your code here
		  Arrays.sort(input);
       printSubsetsHelper(input,0,new int[0]);
	}
    
    private static void printSubsetsHelper(int[] input, int startIndex, int[] output)
    {
        //Base case  - If start index = input.length, print the output and return
        if (startIndex==input.length)
        {
            for (int i=0;i<output.length;i++)
            {
                System.out.print(output[i]+" ");
            }
            System.out.println();
            return;
        }
        
        //Case one, output contains element of input array at startIndex 
        int[] newOutput = new int[output.length+1];
        for (int i=0;i<output.length;i++)
        {
            newOutput[i]=output[i];
        }
        newOutput[output.length]=input[startIndex];
        printSubsetsHelper(input,startIndex+1,newOutput);
        
        //Case 2, output does not contain element of input array at startIndex
     // Skip duplicates
        while (startIndex + 1 < input.length && input[startIndex] == input[startIndex + 1]) {
            startIndex++;
        }
        printSubsetsHelper(input,startIndex+1,output);
    }
    */
		// correct code
		 Arrays.sort(input);
	        printSubsetsHelper(input, 0, new int[0]);
	    }

	    private static void printSubsetsHelper(int[] input, int startIndex, int[] output) {
	        // Print the output array
	        for (int i = 0; i < output.length; i++) {
	            System.out.print(output[i] + " ");
	        }
	        System.out.println();

	        // Base case - If startIndex = input.length, return
	        if (startIndex == input.length) {
	            return;
	        }

	        // Include the element at startIndex
	        int prev = -1;
	        for (int i = startIndex; i < input.length; i++) {
	            if (prev != -1 && input[i] == prev) {
	                continue; // Skip duplicates
	            }
	            prev = input[i];
	            int[] newOutput = Arrays.copyOf(output, output.length + 1);
	            newOutput[output.length] = input[i];
	            printSubsetsHelper(input, i + 1, newOutput);
	        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int input[] = { 1,1,2 };
		  System.out.print("[]"); // Print the empty array as the first line
		    printSubsets(input);
		}
	}


