package functions;

public class FunctionOutputQuestion {
	
	public static void c(int n) {
		System.out.println("inside c " +n);
		n++;
	}
	public static void b(int n) {
		c(n);
		System.out.println("inside b " +n);
		n++;
	}
	public static void a(int n) {
		b(n);
		System.out.println("inside a " +n);
		n++;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n=10;
  a(n);
		
	System.out.println("inside main "+n);
	}

}
