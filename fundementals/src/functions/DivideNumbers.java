package functions;

public class DivideNumbers {
	
	public static int divideNumbers(int num,int deno) {
		if(deno ==0) {
			return Integer.MIN_VALUE;
		}
		return num/deno;
	}
	
	public static void printDivisionResult(int num,int deno) {
		if(deno==0) {
			System.out.println("division by zero not allowed");
			return;
		}
		System.out.println(num/deno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int num = 8;
		  int deno = 0;
		  printDivisionResult(num,deno);
		  int result = divideNumbers(num,deno);
		  if(result>0) {
			  
		  }
		  else {
			  
		  }
	//	  System.out.println(result);
		  

	}

}
