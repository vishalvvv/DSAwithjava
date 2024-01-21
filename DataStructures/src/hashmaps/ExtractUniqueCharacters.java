package hashmaps;
import java.util.HashMap;
public class ExtractUniqueCharacters {
	
	public static String uniqueChar(String str){
		if(str.length()==0) {
			return "";
		}
		String ans = "";
		HashMap<Character, Boolean> map = new HashMap<>();
		for(int currentIndex=0;currentIndex<str.length();currentIndex++) {
			char currentChar = str.charAt(currentIndex);
			if(!map.containsKey(currentChar)) {
				map.put(currentChar, true);
				ans += currentChar;
			}
		}
		return ans;

		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ababacd";
		String str2 = "abcde";
		System.out.println(uniqueChar(str1));
		System.out.println(uniqueChar(str2));
		//abcd are the respective outputs
		//abcde

	}

}
