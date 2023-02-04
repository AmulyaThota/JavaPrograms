package PracticeSeleniumJava;

public class Fibbanoccii {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int sum = a+b;
		
		for(int i=2;i<=20;i++) {
			
			a=b;
			b=sum;
			sum=a+b;
			
			System.out.println(a+b);
		}
	}

}
