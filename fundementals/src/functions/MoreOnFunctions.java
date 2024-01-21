package functions;

public class MoreOnFunctions {
	public static double sum(int a,int b,double c) {
		double ans = a+b+c;
		return ans;
	}
	
	public static void printEvenNumbers(int start,int end) {
		if(start%2 !=0) {
			start++;
		}
		for(int i=start;i<=end;i+=2) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		printEvenNumbers(3,17);
	}
}
	
	// public static void main(String[] args) {
	//	int num1 = 10;
	//	int num2 = 16;
	//	double ans = sum(num1,num2,10.5);
	//	System.out.println(ans);
	// }
	// public static int sum(int a,int b) {
	//	int ans = a+b;
	//	return ans;
	// }

	// public static void main(String[] args) {
		// TODO Auto-generated method stub
    // int num1 = 10;
    // int num2 = 16;
    //  int ans = sum(num1,num2);
    // System.out.println(ans);
	// }

 // }
