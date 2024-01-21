package stacks;
import java.util.*;
public class MinimumBracketReversal {
	
	public static int countBracketReversals(String input) {
		//Your code goes here
		if (input.length()%2!=0)
        {
            return -1;
        }
        Stack<Character> stack=new Stack<Character>();
        int count=0;
        for (int i=0;i<input.length();i++)
        {
            char c=input.charAt(i);
            if (c=='{')
            {
                stack.push(c);
            }
            else
            {
                if (stack.isEmpty())
                {
                    stack.push(c);
                }
                else if (stack.peek()=='}')
                {
                    stack.push(c);
                }
                else if (stack.peek()=='{')
                {
                    stack.pop();
                }
            }
        }
        
        while(!stack.isEmpty())
        {
            char c1=stack.pop();
            char c2=stack.pop();
            
            if (c1==c2)
            {
                count=count+1;
            }
            else
            {
                count=count+2;
            }
        }
        return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "{{}{{{}";
	    String input2 = "{{{{}}";
	    String input3 = "{{}}";
	    String input4 = "{{}{}{}}";

	    int count1 = countBracketReversals(input1);
	    int count2 = countBracketReversals(input2);
	    int count3 = countBracketReversals(input3);
	    int count4 = countBracketReversals(input4);

	    System.out.println("Count of bracket reversals:");
	    System.out.println("Input 1: " + count1); 
	    System.out.println("Input 2: " + count2); 
	    System.out.println("Input 3: " + count3); 
	    System.out.println("Input 4: " + count4); 
	    
	    // input from console
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the input string: ");
	        String input = scanner.nextLine();

	        int count = countBracketReversals(input);

	        System.out.println("Count of bracket reversals: " + count);

	}

}
