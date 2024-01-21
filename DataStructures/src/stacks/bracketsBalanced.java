package stacks;
import java.util.*;
public class bracketsBalanced {

	 public static boolean isBalanced(String expression) {
	        //Your code goes here
	              Stack<Character> stack=new Stack<Character>();
	        String s = expression;

	        for(int i=0;i<s.length();i++)
	        {
	            char c=s.charAt(i);
	            //System.out.print(c);
	            
	            if (c=='(')
	            {
	                //System.out.println();
	              stack.push(c);
	            }
	            else {
	                if(!stack.isEmpty() && c==')' && stack.peek()=='('){
	                    stack.pop();
	                }

	            }
	            }
	            if(stack.isEmpty()){
	                return true;
	            }
	            else {
	                return false;
	            }
	            }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//taking input from console
		
		//  Scanner scanner = new Scanner(System.in);

	    //    System.out.println("Enter an expression: ");
	     //   String expression = scanner.nextLine();

	      //  System.out.println("Expression: " + expression);
	      //  System.out.println("Is balanced? " + isBalanced(expression));
	        
	   //boolean isBalanced = bracketsBalanced.isBalanced("((()))");
	        boolean isBalanced = bracketsBalanced.isBalanced("()()(()");
	        System.out.println(isBalanced);

	}

}
