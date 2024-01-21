package triesandhuffmancoding;
import java.util.ArrayList;
import java.util.List;
	
public class Trie {

	private TrieNode root;
	// public int count;
	
	
	
	public Trie() {
		root = new TrieNode('\0');
	}
	
	private void addHelper(TrieNode root,String word) {
		if(word.length() == 0) {
			root.isTerminal = true;
			return;
		}
		
		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		addHelper(child,word.substring(1));
	}
	
	public void add(String word) {
		addHelper(root,word);
		
	}
	
	private boolean searchHelper(TrieNode root,String word) {
		if(word.length() == 0) {
			return root.isTerminal;
		}
		int childIndex = word.charAt(0)-'A';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			return false;
		}
		return searchHelper(child,word.substring(1));
	}
	
	
	
	public boolean search(String word) {
		return searchHelper(root,word);
	}
	
	
	public void removeHelper(TrieNode root,String word) {
		if(word.length() == 0) {
			root.isTerminal = false;
			return;
		}
		int childIndex = word.charAt(0)-'A';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			return ;
		}
		removeHelper(child,word.substring(1));
		if(!child.isTerminal && child.childCount == 0) {
			root.children[childIndex] = null;
			root.childCount--;
		}
		
		
		
	}

public void remove(String word) {
		removeHelper(root,word);
	}

private int countWordsHelper(TrieNode root) {
    int count = 0;

    if (root.isTerminal) {
        count++;
    }

    for (TrieNode child : root.children) {
        if (child != null) {
            count += countWordsHelper(child);
        }
    }

    return count;
}

public int countWords() {
    return countWordsHelper(root);
}

private boolean patternMatchingHelper(TrieNode root, String word) {
    if (word.length() == 0) {
        return true;
    }

    int childIndex = word.charAt(0) - 'A'; // Convert character to an index (0 to 25)
    TrieNode child = root.children[childIndex];

    if (child == null) {
        return false;
    }

    return patternMatchingHelper(child, word.substring(1));
}


public boolean patternMatching(String word ) {
    return patternMatchingHelper(root,word);
}


public String reverse(String word) {
	
	String xString="";
	for(int i=word.length()-1;i>=0;i--) {
		xString+=word.charAt(i);
	}
	return xString;
	
  }




 private boolean isPalindrome(String word) {
    int left = 0;
    int right = word.length() - 1;
    while (left < right) {
        if (word.charAt(left) != word.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}

private boolean palindromePairHelper(TrieNode root, ArrayList<String> words) {
    for (int i = 0; i < words.size(); i++) {
        String word = words.get(i);

        // Check if the word is a palindrome itself
        if (isPalindrome(word) && search(word)) {
            return true;
        }

        // Check for pairs (word + reverse of a word)
        String reversedWord = reverse(word);
        Trie suffixTrie = new Trie();
        for (int j = 0; j < reversedWord.length(); j++) {
            suffixTrie.add(reversedWord.substring(j));
        }
        for (String w : words) {
            if (suffixTrie.search(w)) {
                return true;
            }
        }
    }
    return false;
}

public boolean palindromePair(ArrayList<String> words) {
    return palindromePairHelper(root, words);
}  

/*

private static boolean palindromePairHelper(TrieNode node, String word) {
    // If the current node represents a word in the Trie and the remaining suffix is a palindrome,
    // then there exists a palindrome pair.
    if (node.isTerminal && isPalindrome(word)) {
        return true;
    }

    // If the word ends, we will explore all the suffixes from the current node.
    if (word.length() == 0) {
        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null && palindromePairHelper(node.children[i], word)) {
                return true;
            }
        }
    } else {
        // Continue searching for the next character in the Trie.
        char c = word.charAt(0);
        int index = c - 'A';
        if (node.children[index] != null && palindromePairHelper(node.children[index], word.substring(1))) {
            return true;
        }
    }

    return false;
}

private static boolean isPalindrome(String word) {
    int left = 0;
    int right = word.length() - 1;
    while (left < right) {
        if (word.charAt(left) != word.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}

public static boolean palindromePair(TrieNode root, String word) {
    return palindromePairHelper(root, word);
}

 */


      



private void autoCompleteHelper(TrieNode root, String prefix, String current, List<String> words) {
    if (prefix.length() == 0) {
        if (root.isTerminal) {
            words.add(current);
        }
        for (TrieNode child : root.children) {
            if (child != null) {
                autoCompleteHelper(child, prefix, current + child.data, words);
            }
        }
    } else {
        int childIndex = prefix.charAt(0) - 'A';
        TrieNode child = root.children[childIndex];
        if (child != null) {
            autoCompleteHelper(child, prefix.substring(1), current + child.data, words);
        }
    }
}

public void autoComplete(String word) {
	  List<String> suggestions = new ArrayList<>();
      autoCompleteHelper(root, word, "", suggestions);

      for (String suggestion : suggestions) {
          System.out.println(suggestion);
      }
  }





}
