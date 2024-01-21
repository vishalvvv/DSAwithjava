package Strings;

public class StringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= {'C','o','d','i','n','g'};
		String str1="coding";
		String str2=" is fun";
		// String str3= str1+str2;
		String str3=str1.concat(str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.contains("ing"));
		System.out.println(str3);
		// System.out.println(str1+str2);
		// String str1="";
	// System.out.println(str1.length());
	//	System.out.println(str.charAt(2));

	}

}
