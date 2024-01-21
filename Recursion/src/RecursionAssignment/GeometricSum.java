package RecursionAssignment;

public class GeometricSum {
	
	public static double  findGeometricSum(int k) {
		if(k<0) {
			return 0.0;
		}
		double smallSum= findGeometricSum(k-1);
		double value = smallSum+(1/Math.pow(2,k));
		return value;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println( findGeometricSum(4));
		
	}

}
