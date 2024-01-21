package Strings;

public class CountWords {
	
	public static int countWords(String str) {	
		// another method
	//	if(str.length()==0){
	//		return 0;
	//		}
			//Your code goes here
	//		String arr[]=str.split(" ");
		//	return arr.length;
	//	}
		
		
		//Your code goes here
        int count = 0;
        for(int i=0;i<str.length(); i++) {
            if(str.charAt(i) == ' ') {
                count++;
            }
        }
        if(str.length() == 0) {
            return count;
        } else {
         return count + 1;   
        }
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String sentence = "This is a sample sentence.";
	        int wordCount = countWords(sentence);
	        System.out.println("Word count: " + wordCount);
		

	}
	

}
