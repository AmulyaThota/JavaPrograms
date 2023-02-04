package PracticeSeleniumJava;

public class ExtractString {

	public static void main(String[] args) {
		
		String str = "My Name Is Preeti Jain";
		
		String[] split = str.split("str",4);
		
		for(String word : split)
			System.out.println(word);
		
		

	}

}
