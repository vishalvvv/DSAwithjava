package priorityqueues2;

public class CheckMaxHeap {
	public static boolean CheckMaxHeap(int[] arr)
	{
	for(int index=0;index<arr.length;index++)
	{
		int parentIndex = index;
		int leftChildIndex = 2*index+1;
		int rightChildIndex = 2*index+2;
		if(leftChildIndex < arr.length && arr[leftChildIndex] > arr[parentIndex]) {
			return false;
		}
		if(rightChildIndex < arr.length && arr[rightChildIndex] > arr[parentIndex]) {
            return false;			
		}
		
		
	}
	return true;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] = {42,20,18, 6,14,11,9,4};
			System.out.println(CheckMaxHeap(arr));


	}

}
