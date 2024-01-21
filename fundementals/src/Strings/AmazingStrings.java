package Strings;
import java.util.Scanner;
public class AmazingStrings {
	
	public static boolean areAllCharactersPresent(String first, String second, String third) {
        int[] charCount = new int[26];
        
        for (char c : first.toCharArray()) {
            charCount[c - 'A']++;
        }
        
        for (char c : second.toCharArray()) {
            charCount[c - 'A']++;
        }
        
        for (char c : third.toCharArray()) {
            if (charCount[c - 'A'] <= 0) {
                return false;
            }
            charCount[c - 'A']--;
        }
        
        for (int count : charCount) {
            if (count > 0) {
                return false;
            }
        }
        
        return true;
    }


      public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int T = scanner.nextInt();
	        
	        for (int t = 0; t < T; t++) {
	            String first = scanner.next();
	            String second = scanner.next();
	            String third = scanner.next();
	            
	            if (areAllCharactersPresent(first, second, third)) {
	                System.out.println("YES");
	            } else {
	                System.out.println("NO");
	            }
	        }
	        
	        

	}

}
