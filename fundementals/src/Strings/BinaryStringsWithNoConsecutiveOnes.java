package Strings;
import java.util.ArrayList;
import java.util.Scanner;

public class BinaryStringsWithNoConsecutiveOnes {
	
	public static ArrayList<String> generateString(int k) {
        ArrayList<String> result = new ArrayList<>();
        generateBinaryStrings(k, "", result);
        return result;
    }

    public static void generateBinaryStrings(int k, String current, ArrayList<String> result) {
        if (k == 0) {
            result.add(current);
            return;
        }

        // Place 0 at the current position
        generateBinaryStrings(k - 1, current + "0", result);

        // Place 1 at the current position if the previous digit is not 1
        if (current.length() == 0 || current.charAt(current.length() - 1) != '1') {
            generateBinaryStrings(k - 1, current + "1", result);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  // Number of test cases

        for (int testCase = 0; testCase < t; testCase++) {
            int k = scanner.nextInt();  // Length of the binary string
            ArrayList<String> strings = generateString(k);
            for (String str : strings) {
                System.out.print(str + " ");
            }
            System.out.println();  // Move to the next line after each test case
		
	//	 int k = 4;  // Example length
	     //   ArrayList<String> strings = generateString(k);
	     //   for (String str : strings) {
	      //      System.out.print(str + " ");
	        }

	}

}
