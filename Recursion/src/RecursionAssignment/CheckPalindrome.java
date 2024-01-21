package RecursionAssignment;

public class CheckPalindrome {
	
	public static boolean isStringPalindrome(String input) {
		if(input.length()<=1) {
			return true;
		}
		int n =input.length();
		
		if(input.charAt(0)!=(input.charAt(n-1))) {
		return false;
		}
		  
		boolean result = isStringPalindrome(input.substring(1, n-1));
        return result;
	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isStringPalindrome("racecar"));
	}

}
