package TimeComplexity;

public class FindtheUniqueElement {
	
	public static int findUnique(int arr[]) {
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			ans=ans^arr[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {2,3,1,6,3,6,2};
      System.out.print(findUnique(arr));
	}

}
