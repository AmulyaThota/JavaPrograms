package PracticeSeleniumJava;

public class StaticAndNonstaticMethods {
	
	static void m1() {
		System.out.println("from m1");
		
	}
	void m2() {
		System.out.println("from m2");
	}

	/*
	 * public static void main(String[] args) { StaticAndNonstaticMethods.m1();
	 * 
	 * StaticAndNonstaticMethods non = new StaticAndNonstaticMethods(); non.m2();
	 * non.m1(); }
	 */
}
 class B extends StaticAndNonstaticMethods {
	
	static void m1() {
		System.out.println("m1 from class B ");
		
	}
	public static void main(String[] args) {
		
		StaticAndNonstaticMethods a = new B();
		a.m1();
	}
}
 
