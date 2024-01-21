package SearchingandSorting;

public class SelectionSortExample {
	
	 public static void selectionSort(int[] arr) {
	    	//Your code goes here
	        for(int i=0;i<arr.length;i++){
	            for(int j=i+1;j<arr.length;j++){
	                if(arr[i]>arr[j]){
	                    int temp=arr[i];
	                    arr[i]=arr[j];
	                    arr[j]=temp;
	                }
	            }
	        }
	    }   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              int arr[]= {2,13,4,1,3,6,28};
              selectionSort(arr);
              for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i] + " ");
              }
	}

}
