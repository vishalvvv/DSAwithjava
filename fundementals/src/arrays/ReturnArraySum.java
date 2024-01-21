package arrays;

public class ReturnArraySum {
	
	public static int returnArraySum(int arr[]) {
		int sum1=0;
		for(int i=0;i<arr.length;i++) {
			sum1=sum1+arr[i];
		}
			return sum1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int total=returnArraySum(arr);
		System.out.println(total);
		

	}

}
