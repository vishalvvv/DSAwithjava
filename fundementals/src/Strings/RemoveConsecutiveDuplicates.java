package Strings;

public class RemoveConsecutiveDuplicates {
	
	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
		char ch=str.charAt(0);
		String newString=""+ch;


		for(int i=1;i<str.length();i++){
			if(str.charAt(i)==ch){

			}
			else {
				newString = newString+str.charAt(i);
			}
			ch=str.charAt(i);
		}
		return newString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String input = "aaabbbcccdddeeefffggg";

	        String result = removeConsecutiveDuplicates(input);

	        System.out.println("Original String: " + input);
	        System.out.println("String after removing consecutive duplicates: " + result);
	}

}
