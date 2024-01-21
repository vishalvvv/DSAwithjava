package Recursion3;
import java.util.Arrays;
public  class ReturnPermutationsOfAString {
	
	public static String[] permutationOfString(String input){
		  return helper(input);
			}
			
		    private static String[] helper(String up){
		        
		        if(up.length()==1)
		            return new String[]{up};
		        
		        String [] sm1 =helper(up.substring(1));
		        // ArrayList<String> l1 = new ArrayList<>();
		        String [] ans={};
		        for(String s1: sm1){
		            String [] ans1=new String[ans.length+s1.length()+1];
		            int k=0;
		            while(k<ans.length){
		                ans1[k]=ans[k];
		                k++;
		            }
		            for (int i = 0; i <=s1.length() ; i++) {
		                String s=s1.substring(0,i)+up.charAt(0)+s1.substring(i);
		                // l1.add(s);
		                ans1[k]=s;
		                k++;
		            }
		            ans=ans1;
		        }
		        Arrays.sort(ans); // Sort the permutations lexicographically
		        return ans;
		    }


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "abc";
	        String[] permutations = permutationOfString(input);
	        for (String permutation : permutations) {
	            System.out.println(permutation);
	        }
		

	}
	}

