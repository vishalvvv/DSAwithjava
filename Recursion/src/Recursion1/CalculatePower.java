package Recursion1;

public class CalculatePower {
	public static int power(int x, int n) {
	if(n==0){
		return 1;
	}

	int smallOutput=power(x,n-1);
	int output=x*smallOutput;
	return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(power(5,2));
	}

}
