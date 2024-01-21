package TimeComplexity;

public class DuplicateInArray {
	
	public static int findDuplicate(int arr[]) {
		int sum1=0;
		for(int i=0;i<arr.length;i++) {
			sum1=sum1+arr[i];
		}
		int sum2=((arr.length-2)*(arr.length-1))/2;
		return sum1-sum2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,7,2,5,4,7,1,3,6};
             System.out.print(findDuplicate(arr));
	}

}
