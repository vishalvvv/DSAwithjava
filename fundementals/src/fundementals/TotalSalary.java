package fundementals;

import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int basic = s.nextInt();
		char grade = s.next().charAt(0);
		
		double hra = basic*0.2;
		double da = basic*0.5;
		 double pf = basic*0.11;
		   double allowance;
		
		// if(grade=='A') {
		//	double totalSalary = basic + hra + da + 1700 -pf;
		//	System.out.println(Math.round(totalSalary));
		// }
     // if(grade=='B') {
    	// double totalSalary = basic + hra + da + 1500 -pf;
    	// System.out.println(Math.round(totalSalary));
	// }
     // if(grade>='C'){
    	// double totalSalary = basic + hra + da + 1300 -pf;
    	// System.out.println(Math.round(totalSalary));
    // }
		switch(grade) {
        case 'A':
             allowance = 1700;
           break;

    case 'B':
        allowance = 1500;
        break;
    default:
       allowance = 1300;
        break;
}

 double totalSalary = basic + hra + da + allowance - pf;
System.out.println(Math.round(totalSalary));	
		
		
}
}