package stacks;
import java.util.*;
import java.util.Scanner;
public class CheckRedundantBrackets {
	
	
	public static boolean checkRedundantBrackets(String expression) {
		//Your code goes here
		   Stack<Character> stack=new Stack<Character>();
        int count=0;
        for(int i=0;i<expression.length();i++)
        {
            char c=expression.charAt(i);
            //System.out.print(c);
            
            if (c==')')
            {
                //System.out.println();
                while(!stack.isEmpty() && stack.peek()!='(')
                {
                    count=count+1;
                    stack.pop();
                    //System.out.print(stack.pop());
                }
                //System.out.println();
                //System.out.println(count);
                if (count==0 || count==1)
                {
                    return true;
                }
                stack.pop();
                count=0;
                
            }
            else
            {
                stack.push(c);
            }
        }
        return false;
	}
	
	// Approach -2 (Optimal)
 //   Stack<Character> stack=new Stack<>();
  //  for(int i=0;i<expression.length();i++){
     //   if(expression.charAt(i)!=')')
     //       stack.push(expression.charAt(i));
     //   else{
            
         //   int c=0;
         //   while(stack.peek()!='('){
         //       stack.pop();
         //       c++;
        //    }
        //    stack.pop();
        //    if(c<2)
          //      return true;
      //  }
 //   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	  String expression1 = "((a + b))";
		//    String expression2 = "(a + (b + c))";
		//    String expression3 = "(a + b) + ((c + d))";
//
		//    boolean result1 = checkRedundantBrackets(expression1);
		//    boolean result2 = checkRedundantBrackets(expression2);
		//    boolean result3 = checkRedundantBrackets(expression3);

		 //   System.out.println("Expression 1: " + result1); 
		 //   System.out.println("Expression 2: " + result2); 
		  //  System.out.println("Expression 3: " + result3); 
		    
		    Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an expression: ");
	        String expression = scanner.nextLine();

	        boolean result = checkRedundantBrackets(expression);
	        System.out.println("Result: " + result);
		}

	}


