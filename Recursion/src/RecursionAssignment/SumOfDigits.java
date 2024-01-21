package RecursionAssignment;

public class SumOfDigits {
	
	public static int sumOfDigits(int input) {
		if(input<10) {
			return input;
		}
		int value=sumOfDigits(input/10);
		return value+input%10;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println(sumOfDigits(12345));
	}

}
