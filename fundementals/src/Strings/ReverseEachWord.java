package Strings;

public class ReverseEachWord {
	
	public static String reverseEachWord(String str) {
		//Your code goes here

		String arr[]=str.split(" ");
		String newString="";
		for(String i:arr){
			StringBuilder sb=new StringBuilder(i);
			sb.reverse();
			newString = newString+sb.toString()+" ";

		}
		return newString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "Hello World! Welcome to the Java Programming.";

	        String reversed = reverseEachWord(input);

	        System.out.println("Original String: " + input);
	        System.out.println("String with Reversed Words: " + reversed);
	}

}
