package Recursion2;

public class ReplaceCharacters {
	
	 public static String replaceChar(String s,char a,char b){
	        if(s.length()==0){
	            return s;
	        }
	        String smallOutput=replaceChar(s.substring(1),a,b);
	        if(s.charAt(0)==a){
	            return b+smallOutput;
	        }else{
	            return s.charAt(0)+smallOutput;
	        }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replaceChar("abcxdxex",'x','y'));
		
	}

}
