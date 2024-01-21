package hashmaps;
import java.util.HashMap;
public class PairSumToZero {
	
	public static int PairSum(int[] input, int size) {
	
	  if (size==0)
          return 0;
      
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int key:input)
      {	
          if(map.containsKey(key))
      	{
          	map.put(key,map.get(key)+1);
      	}
          else
          {
              map.put(key,1);
          }   
      }
	
	   int countPairs=0;
       for (Integer i: map.keySet())
       {
           if (map.containsKey(-i) && i!=0)
           {
               //System.out.println("Found the negative of " + i);
           	countPairs=countPairs+(map.get(i)*map.get(-i));   
               //System.out.println("Current count of pairs: "+countPairs);
               //map.remove(i);
           }
           //System.out.println();
       }
       countPairs=countPairs/2;
       if (map.containsKey(0))
       {
           int val=map.get(0);
           countPairs=countPairs+(val*(val-1))/2;
       }
       return countPairs;
	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,0,2,-2,-2,1,-1,5};
		System.out.println(PairSum(arr, 8)); //answer is 4
		
		

	}

}
