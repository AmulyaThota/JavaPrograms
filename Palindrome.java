package PracticeSeleniumJava;

public class Palindrome {

	public static void main(String[] args) {
		String s = "olo";
		
		StringBuilder sbr = new StringBuilder(s);
		String rev =  sbr.reverse().toString();
	
		 System.out.println(s);
		 System.out.println(rev);
		if(s.equals(rev)) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("not palindrom");
		}

	}

}

class CheckNmberPalindrome {
	
	public static void main(String[] args) {
		
		int num = 565, rev = 0,reminder;
		int temp = num;
		
		while(num>0) {
			
			reminder = num%10;
			rev = rev*10+reminder;
			num = num/10;
			
		}
		System.out.println(rev);
		
		if(temp==rev) {
			System.out.println("is palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
		
	}
}
