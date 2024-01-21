package triesandhuffmancoding;
import java.util.ArrayList;
public class TrieUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trie t = new Trie();
		// t.add("NOTE");
		// t.add("AND");
		
	//	t.add("BAT");
     //   t.add("TAB");
     //   t.add("RACE");
        

        ArrayList<String> words = new ArrayList<>();
         words.add("BAT");
        words.add("TAB");
       words.add("RACE");
       words.add("CAR");
        
        words.add("ABC");
        words.add("DEF");
        
        words.add("GHI");
   //     words.add("CBA");
        
        boolean hasPalindromePair = t.palindromePair(words);
        System.out.println("Palindrome Pair exists: " + hasPalindromePair);
		
	//	 output for auto complete
		  t.add("BAT");
		    t.add("TAB");
		  t.add("BAD");
		    t.add("BATH");
		    t.add("BAG");

		    System.out.println("Auto-completion suggestions for 'BA':");
		    t.autoComplete("BA");
		
		
	   String word = "AND";
	        boolean exists = t.patternMatching(word);
	       System.out.println("Word exists in the Trie: " + exists);
		  int wordCount = t.countWords();
	        System.out.println("Total number of words in the Trie: " + wordCount);
		
		System.out.println(t.search("AND"));
		
		
		
	t.remove("AND");
		System.out.println(t.search("AND"));
		
		
	}

}
