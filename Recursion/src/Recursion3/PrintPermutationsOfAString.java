package Recursion3;

public class PrintPermutationsOfAString {
	
	public static void permutations(String input){
	// Write your code here
    permutationsHelper(input,"");

}

private static void permutationsHelper(String input, String output)
{
    if (input.length()==0)
        System.out.println(output);
    
    for (int i=0;i<input.length();i++)
        permutationsHelper(input.substring(0,i)+input.substring(i+1), output+input.charAt(i));
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abc";
	    permutations(input);

	}

}
