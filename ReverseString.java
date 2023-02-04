package PracticeSeleniumJava;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str = "olo";
		
		StringBuilder sbr = new StringBuilder(str);
		StringBuilder rev = sbr.reverse();
		
		System.out.println("reverse string is" +rev);
		  if(str.equals(rev.toString())) {
			  System.out.println("palindrome");
		  }else {
			  System.out.println("not palindrome"); 
		  }
		
		
	}

}

class ReverseAnother {
	 static void main () {
		String s = "amulya";
		char rev;
		char string[] = s.toCharArray();
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(rev = string[i]);
		}
		
		//if(s.)
	}
}
