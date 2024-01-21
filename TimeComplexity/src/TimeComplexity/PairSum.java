package TimeComplexity;

public class PairSum {

	public static int pairSum(int[] arr, int num) {
		//Your code goes here
int n = arr.length;
	int count =0;

	for(int i=0; i<n; i++)
	{

		for(int j=i+1; j<n; j++)
		{
			if(arr[i]+arr[j]==num)
			{
				count++;
				
			}
		}
	}
	return count;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1,3,6,2,5,4,3,2,4};
		    int num = 7;
		    
		    int result = pairSum(arr, num);
		    
		    System.out.println("Number of pairs: " + result);
		}
	}


