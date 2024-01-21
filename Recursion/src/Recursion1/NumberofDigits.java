package Recursion1;

public class NumberofDigits {
	
	public static int count(int n){
		if(n/10==0){
			return 1;
		}
 int smallAns=count(n/10);
 return smallAns+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(count(175));
	}

}
