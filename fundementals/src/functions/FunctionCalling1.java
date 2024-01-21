package functions;

public class FunctionCalling1 {
	
	public static int sum(int a,int b) {
		int result = a+b;
		return result;
	}
	
	public static void increment(int n) {
		n++;
		System.out.println("increment "+n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 int n=10;
  increment(n);
  System.out.println("main "+ n);
	}

}
