package SearchingandSorting;
import java.util.Arrays;
public class CountSmall {
	
	public static int[] countSmall(int n, int m, int []a, int []b) {
        // Write your code here.

       
         int result[]= new int[n];
         Arrays.sort(b);
         for(int i=0;i<n;i++){
             int count=0;
             for(int j=0;j<m;j++){
                 if(b[j]<=a[i]){
                     count++;
                 }
                 else{
                     break;
                 }
             }
             result[i]=count;
         }
         return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 4;
	        int m = 6;
	        int[] a = {5, 2, 7, 4};
	        int[] b = {1, 8, 5, 3, 9, 2};

	        int[] result = countSmall(n, m, a, b);

	        System.out.println("Result: " + Arrays.toString(result));
            
            }
	}


