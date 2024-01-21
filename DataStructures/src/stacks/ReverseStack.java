package stacks;
import java.util.Stack;
public class ReverseStack {
	
	public static void reverseStack(Stack<Integer> s1,Stack<Integer> helper) {
		 if (s1.size()==0 || s1.size()==1)
	        {
	            return;
	        }
	        
	        int top=s1.pop();
	        reverseStack(s1,helper);
	        
	        while(!s1.isEmpty())
	        {
	            helper.push(s1.pop());
	        }
	        s1.push(top);
	        
	        while(!helper.isEmpty())
	        {
	            s1.push(helper.pop());
	        }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {5,6,7,1,9};
		Stack<Integer> stack=new Stack<>();
		Stack<Integer> helper = new Stack<>();
		
		for(int elem:arr) {
			stack.push(elem);
		}
		
		reverseStack(stack,helper);
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}

	}

}
