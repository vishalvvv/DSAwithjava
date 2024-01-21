package functions;

public class FarenheitToCelsius {
	
	public static void printFahrenheitTable(int start, int end, int step) {
		
		 while(start<=end) {
			 int result = 5*(start-32)/9;
			
			 System.out.println(start+" "+result);
		 
			 start = start+step;
		 }
			
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start =0;
	int	 end=100;
		int step=20;
		
		
		
			 System.out.print(" ");
		 
		
		 printFahrenheitTable(0,100,20);
	}

}
