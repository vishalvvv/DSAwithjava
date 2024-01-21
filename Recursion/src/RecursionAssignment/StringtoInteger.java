package RecursionAssignment;

public class StringtoInteger {
	public static int convertStringToInt(String input){
		// Write your code here

		if(input.length()==1){
			return input.charAt(0)-'0';

		}
int ans=convertStringToInt(input.substring(0,input.length()-1));

int lastDigit=input.charAt(input.length()-1)-'0';
return ans*10+lastDigit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertStringToInt("12567"));

	}

}
