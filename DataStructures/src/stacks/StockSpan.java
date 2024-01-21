package stacks;
import java.util.*;
public class StockSpan {
	
	public static int[] stockSpan(int[] price) {
		//Your code goes here
		 int[] span=new int[price.length];
        Stack<Integer> stack=new Stack<Integer>();
        span[0]=1;
        stack.push(0);
        
        for (int i=1;i<price.length;i++)
        {
            while(!stack.isEmpty() && price[stack.peek()]<price[i])
            {
                stack.pop();
            }
            //System.out.println(stack.size());
            
            if (stack.isEmpty())
            {
                span[i]=i+1;
            }
            else
            {
                //System.out.println("i = "+i);
                //System.out.println("top = "+stack.peek());
                span[i]=i-stack.peek();
            }
            stack.push(i);
            //System.out.println("New top: "+stack.peek());
            //System.out.println();
        }
        return span;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int[] price = { 100, 80, 60, 70, 60, 75, 85 };
	//	int[] price = { 60,70,80,100,90,75,80,120 };
     //   int[] span = stockSpan(price);

     //   System.out.println("Stock Span:");
      //  for (int i = 0; i < span.length; i++) {
      //      System.out.println("Day " + (i + 1) + ": " + span[i]);
      //  }
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int numDays = scanner.nextInt();

        int[] price = new int[numDays];

        System.out.println("Enter the stock prices for each day:");
        for (int i = 0; i < numDays; i++) {
            price[i] = scanner.nextInt();
        }

        int[] span = stockSpan(price);

        System.out.println("Stock Span:");
        for (int i = 0; i < span.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + span[i]);
        }

	}

}
