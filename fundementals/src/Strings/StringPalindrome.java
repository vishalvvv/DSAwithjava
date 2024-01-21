package Strings;

public class StringPalindrome {
	
	public static boolean isPalindrome(String str) {
		//Your code goes here
		int left=0;
		int right=str.length()-1;
		while(left<right){
			if(str.charAt(left)!=str.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input1 = "radar";
	        String input2 = "hello";

	        boolean isPalindrome1 = isPalindrome(input1);
	        boolean isPalindrome2 = isPalindrome(input2);

	        System.out.println(input1 + " is a palindrome: " + isPalindrome1);
	        System.out.println(input2 + " is a palindrome: " + isPalindrome2);
	}

}
