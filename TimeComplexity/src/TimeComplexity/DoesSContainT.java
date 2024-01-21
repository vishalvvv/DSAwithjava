package TimeComplexity;

public class DoesSContainT {
	
	public static boolean checkSequence(String a, String b) {
		  return checkSequence(a,b,0,0);
			}
		    
		   public static boolean checkSequence(String a, String b, int a_idx, int b_idx)
		   {
		       if (b_idx==b.length())
		       {
		           return true;
		       }
		       if (a_idx==a.length())
		       {
		           return false;
		       }
		       if (b.charAt(b_idx)==a.charAt(a_idx))
		       {
		           return checkSequence(a,b,a_idx+1,b_idx+1);
		       }
		       else
		       {
		           return checkSequence(a,b,a_idx+1,b_idx);
		       }
		       
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String a1 = "abcdef";
		    String b1 = "bd";
		    boolean result1 = checkSequence(a1, b1);
		    System.out.println("Result 1: " + result1);
		    
		    String a2 = "abcde";
		    String b2 = "ace";
		    boolean result2 = checkSequence(a2, b2);
		    System.out.println("Result 2: " + result2);
	}

}
