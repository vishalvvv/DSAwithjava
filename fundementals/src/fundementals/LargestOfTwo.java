package fundementals;
import java.util.Scanner;
 public class LargestOfTwo {
	 public static void main(String[] args) {
		 int a,b;
		 Scanner s = new Scanner(System.in);
		 
		 a=s.nextInt();
		 b=s.nextInt();
		 
		 if(a>b) {
			 System.out.println("first num is greater");
		 }
		 else if (b>a) {
			 System.out.println("second num is greater");
		 }
		 else {
			 System.out.println("both are equal");
		 }
		 
		 
	//	 if(a>b) {
	//		 System.out.println("first num is greater");
	// 	 }
	//	 else {
	//		 if (b>a) {
		//		 System.out.println("second num is greater");
		//	 }
		//	 else {
		//		 System.out.println("both are equal");
		//	 }
	//	 }
		 
	//	 if(a>b) {
		//	 System.out.println("first num is greater");
	//	 }
	//	 else {
		//	 System.out.println("second num is greater");
	//	 }
		//  System.out.println("outside if else");
	 }
	 
 }