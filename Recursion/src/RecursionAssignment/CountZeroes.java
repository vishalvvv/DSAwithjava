package RecursionAssignment;

public class CountZeroes {
	
	public static int countZeroesRec(int input) {
		
		// another way of writing code
		
		if(input==0) {
			return 1;
		}
		
		if(input<10) {
			return 0;
		}
		if(input%10==0) {
			return 1+countZeroesRec(input/10);
		}
		return countZeroesRec(input/10);
	}
	//	if(input<10) {
		//	if(input==0) 
		//		return 1;
			//	else 
			//		return 0;
		//		}
		//	int smallAns=countZeroesRec(input/10);
		//	if(input%10==0)
		//		smallAns=1+smallAns;
		//	return smallAns;
		
	// }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(countZeroesRec(708000));
	}

}
