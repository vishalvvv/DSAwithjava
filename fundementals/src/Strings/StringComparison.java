package Strings;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="abc";
		String str2="abc";
		String str3=new String("abc");
		if(str1.equals(str3)) {
			System.out.println("both are equal");
		}
		
	//	if(str1==str2) {
	//		System.out.println("both are equal");
	//	}
		else {
			System.out.println("both are not equal");
		}

	}

}
