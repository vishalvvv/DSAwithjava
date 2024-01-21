package Strings;
import java.util.Arrays;
public class CheckPermutation {
	
	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here

		if(str1.length()!=str2.length()){
			return false;
		}

		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		for(int i=0;i<str1.length();i++){
			if(ch1[i]!=ch2[i]){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input1 = "abcd";
	        String input2 = "dcba";
	        String input3 = "efgh";
	        boolean isPermutation1 = isPermutation(input1, input2);
	        boolean isPermutation2 = isPermutation(input1, input3);

	        System.out.println(input1 + " and " + input2 + " are permutations: " + isPermutation1);
	        System.out.println(input1 + " and " + input3 + " are permutations: " + isPermutation2);
	        
	}

}
