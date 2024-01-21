package arrays;

public class FindDuplicateEement {
	
	public static int duplicateNumber(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					return arr[j];
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[]= {0,7,2,5,4,7,1,3,6};
 int result=duplicateNumber(arr);
 System.out.println(result);
 
 
	}

}
