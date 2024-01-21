package fundementals;

import java.util.Scanner;

public class RemarkStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=0;
		
		
		Scanner s = new Scanner(System.in);
		
		score = s.nextInt();
		
		 if(score>=75 && score<=100){
	            System.out.println("Distinction");
	        }
	     else if(score>=50 && score<=75){
	         System.out.println("Average");
	     }
	     else if (score>=35 && score<=50){
	         System.out.println("Below Average");
	     }
	  
	}

}
