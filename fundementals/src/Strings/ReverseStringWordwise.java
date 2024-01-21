package Strings;

public class ReverseStringWordwise {
	
	public static String reverseWordWise(String input) {
		// Write your code here
		String arr[]=input.split(" ");
		String reverseWord="";
		for(int i=arr.length-1;i>=0;i--){
			reverseWord=reverseWord+arr[i]+" ";
		}
return reverseWord;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "Hello World! Welcome to the Java Programming.";

	        String reversed = reverseWordWise(input);

	        System.out.println("Original String: " + input);
	        System.out.println("Reversed Word-Wise String: " + reversed);
	}

}
