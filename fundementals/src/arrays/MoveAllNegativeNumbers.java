package arrays;
import java.util.* ;
import java.io.*; 
public class MoveAllNegativeNumbers {

	   public static ArrayList<Integer> separateNegativeAndPositive(ArrayList<Integer>nums) {

           // sorting the array
           Collections.sort(nums);

           return nums;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4, -5, -2, 8, -3, 9, -1));

	    ArrayList<Integer> result = separateNegativeAndPositive(nums);

	    System.out.println("Negative numbers: " + result);

	}

}
