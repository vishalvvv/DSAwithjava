package functions;

public class FunctionCalling2 {
	public static int sum(int a,int b) {
		int result = a+b;
		return result;
	}
	
	public static int increment(int n) {
		n++;
		// System.out.println("increment "+n);
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		n =  increment(n);
		  System.out.println("main "+ n);
	}

}
