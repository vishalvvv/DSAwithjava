package RecursionAssignment;

public class MultiplicationOfNumbers {
	
	public static int multiplyTwoIntegers(int m,int n) {
		if(n==1) {
			return m;
		}
		int value=multiplyTwoIntegers(m,n-1);
		return value+m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println(multiplyTwoIntegers(3,5));
	}

}
