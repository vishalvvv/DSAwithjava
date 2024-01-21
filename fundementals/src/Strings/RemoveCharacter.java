package Strings;

public class RemoveCharacter {
	
	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
		String ans="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){

			}
			else {
				ans=ans+str.charAt(i);
			}
		}
return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String input = "Hello, World!";
	        char characterToRemove = 'l';

	        String result = removeAllOccurrencesOfChar(input, characterToRemove);

	        System.out.println("Original String: " + input);
	        System.out.println("String after removing all occurrences of '" + characterToRemove + "': " + result);
	}

}
