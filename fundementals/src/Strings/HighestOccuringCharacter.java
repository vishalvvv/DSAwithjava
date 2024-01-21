package Strings;

public class HighestOccuringCharacter {
	
	public static char highestOccuringChar(String str) {
		//Your code goes here
		int arr[]=new int[256];
		for(int i=0;i<str.length();i++){
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
		}
		int max=Integer.MIN_VALUE;
		char ch=' ';
		for(int i=0;i<str.length();i++){
			if(arr[str.charAt(i)]>max){
				max=arr[str.charAt(i)];
				ch=str.charAt(i);
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello, World!";
        char highestChar = highestOccuringChar(input);

        System.out.println("Original String: " + input);
        System.out.println("Character with the highest occurrence: " + highestChar);
    }

	}


