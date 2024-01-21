package dynamicprogramming1;

public class MinStepsToOne {
	
	public static int countMinStepsToOne(int n) {
		//Your code goes here
        if (n<=1)
            return 0;
        else if (n==2 || n==3)
            return 1;
        
       int output1=countMinStepsToOne(n-1);
       int output2=Integer.MAX_VALUE;
       int output3=Integer.MAX_VALUE;
        
       if (n%2==0)
           output2=countMinStepsToOne(n/2);
        
       if (n%3==0)
           output3=countMinStepsToOne(n/3);
        
       return Math.min(Math.min(output2,output3),output1)+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 4; // Change this to test with different values
        int minSteps = countMinStepsToOne(input);
        System.out.println("Minimum steps to reach 1 from " + input + ": " + minSteps);
	}

}
