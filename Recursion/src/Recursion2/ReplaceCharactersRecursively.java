package Recursion2;
// import java.util.Scanner;
public class ReplaceCharactersRecursively {

	public static String replaceCharacter(String input, char c1, char c2) {
	  if(input.length() == 0) {
          return input;
      }
      String smallOutput = replaceCharacter(input.substring(1), c1, c2);
      if(input.charAt(0) == c1) {
          // System.out.println(input);
          return c2 + smallOutput;
      } else {
          return input.charAt(0)+ smallOutput;
      }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Scanner s = new Scanner(System.in);
	//	String input = s.next();
	//	char c1 = s.next().charAt(0);
	//	char c2 = s.next().charAt(0);
	//	System.out.println(ReplaceCharactersRecursively.replaceCharacter(input, c1, c2));
		System.out.println(replaceCharacter("abacd",'a','x'));
	}

}
