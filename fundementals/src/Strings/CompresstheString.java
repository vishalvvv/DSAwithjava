package Strings;
import java.util.*;
public class CompresstheString {
	
	public static String getCompressedString(String str) {
		if (str == null || str.isEmpty()) {
			return str;
		}
		StringBuilder compressedString = new StringBuilder();
		char currentChar = str.charAt(0);
		int currentCount = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == currentChar) {
				currentCount++;
			} else {
				compressedString.append(currentChar);
				if (currentCount > 1) {
					compressedString.append(currentCount);
				}
				currentChar = str.charAt(i);
				currentCount = 1;
			}
		}
		compressedString.append(currentChar);
		if (currentCount > 1) {
			compressedString.append(currentCount);
		}
		return compressedString.toString();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "aabbbcccdd";
	        String compressedString = getCompressedString(input);

	        System.out.println("Original String: " + input);
	        System.out.println("Compressed String: " + compressedString);
	}

}
