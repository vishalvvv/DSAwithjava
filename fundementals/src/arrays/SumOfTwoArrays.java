package arrays;

public class SumOfTwoArrays {
	
	public static void sumOfTwoArrays(int arr1[],int arr2[],int output[]) {
		int i =arr1.length-1;
		int j=arr2.length-1;
		int k = Math.max(arr1.length,arr2.length);
		int carry=0;
		
		while(i>=0 && j>=0) {
			int sum = arr1[i]+arr2[j]+carry;
			output[k]=sum%10;
			carry=sum/10;
			
			i=-1;
			j=-1;
			k=-1;
		}
		
		while(i>=0) {
			int sum = arr1[i]+carry;
			output[k]=sum%10;
			carry=sum/10;
			
			i-=1;
			k-=1;
		}
		
		while(j>=0) {
			int sum= arr2[j]+carry;
			output[k] = sum%10;
			carry = sum/10;
			
			j-=1;
			k-=1;
		}
		output[0]=carry;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr1 = {1, 2, 3};
		    int[] arr2 = {4, 5, 6};
		    int[] output = new int[Math.max(arr1.length, arr2.length) + 1];

		    sumOfTwoArrays(arr1, arr2, output);

		    System.out.print("Sum: ");
		    for (int i = 0; i < output.length; i++) {
		        System.out.print(output[i] + " ");
		

	}

}
}