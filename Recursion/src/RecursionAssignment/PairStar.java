package RecursionAssignment;

public class PairStar {
	public static String addStars(String s) {
		// Write your code here
     if(s.length()==1){
		 return s;
	 }

	 if(s.charAt(0)==s.charAt(1)){
		 return s.charAt(0)+"*"+addStars(s.substring(1));
	 }

	 else {
		 return s.charAt(0)+addStars(s.substring(1));
	 }

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addStars("hello"));

	}

}
