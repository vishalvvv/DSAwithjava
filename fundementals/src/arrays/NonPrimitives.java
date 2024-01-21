package arrays;

public class NonPrimitives {
	
	public static void printArray(int arr[]) {
		int n=arr.length;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public static void incrementArray(int input[]) {
		System.out.println(input);
		for(int i=0;i<input.length;i++) {
			input[i] = input[i]+1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5};
		System.out.println(arr);
		incrementArray(arr);
		printArray(arr);
		
	}

}
