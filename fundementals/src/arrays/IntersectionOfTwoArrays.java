package arrays;

public class IntersectionOfTwoArrays {

	public static void intersectionArrays(int arr1[],int arr2[]) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]+" ");
					arr2[j]=Integer.MIN_VALUE;
					break;
					
				}
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {2,6,8,5,4,3};
		int arr2[]= {2,3,4,7 };
		intersectionArrays(arr1,arr2);

	}

}
