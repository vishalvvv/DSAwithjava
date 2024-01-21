package arrays2d;

public class MinimumLengthWord {
	
public static String minLengthWord(String input){
		
		// Write your code here
  String[] split = input.split(" ");
        
        StringBuffer ans = new StringBuffer("");
        
        int len = Integer.MAX_VALUE;
        
        for(int i = 0; i < split.length; i++){
            if(split[i].length() < len){
                ans = new StringBuffer("");
                ans.append(split[i]);
                len = split[i].length();
            }
        }
        return ans.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "This is a sample string";

        String minLength = minLengthWord(input);
        System.out.println("Minimum length word: " + minLength);
	}

}
