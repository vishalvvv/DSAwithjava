package Strings;

public class AllSubStrings {
	
	public static void printSubstrings(String str) {
		//Your code goes here
		for(int start=0;start<str.length();start++){
			for(int end=start;end<str.length();end++){
				System.out.println(str.substring(start,end+1));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String input = "abcd";
	        printSubstrings(input);

	}
	}

