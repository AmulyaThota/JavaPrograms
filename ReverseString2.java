package PracticeSeleniumJava;

public class ReverseString2 {
	static void reverseeachwordinstring(String input) {
		String[] words = input.split(" ");
		String reversestring = "";
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			String reverseword = "";
			for(int j=word.length()-1;j>=0;j--) {
				reverseword = reverseword + word.charAt(j);
				
			}
			reversestring = reversestring + reverseword + " ";
		}
		System.out.println(input);
		System.out.println(reversestring);
	}
	public static void main(String[] args) {
		reverseeachwordinstring("my name is amulya");
		
	}

}
