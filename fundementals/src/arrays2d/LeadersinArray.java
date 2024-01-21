package arrays2d;

public class LeadersinArray {
	public static void leaders(int[] input) {
	 int size = input.length;
     for (int i = 0; i < size; i++) 
     {
         int j;
         for (j = i + 1; j < size; j++) 
         {
             if (input[i] < input[j])
                 break;
         }
         if (j == size) 
             System.out.print(input[i] + " ");
     }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] input = {16, 17, 4, 3, 5, 2};

	        System.out.println("Leaders in the array:");
	        leaders(input);
	}

}
