package Strings;
import java.util.Scanner;
public class OneStrings {
	
	 public static int countOneSubstrings(String str) {
	        int count = 0;
	        int result = 0;
	        
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == '1') {
	                count++;
	            } else {
	                result += count * (count + 1) / 2;
	                count = 0;
	            }
	        }
	        
	        // Handle the last segment if it ends with '1'
	        result += count * (count + 1) / 2;
	        
	        return result;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int t = 0; t < T; t++) {
            String str = scanner.next();
            int result = countOneSubstrings(str);
            System.out.println(result);
        }

	}

}
