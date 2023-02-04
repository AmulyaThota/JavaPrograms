package PracticeSeleniumJava;



	class class1{
		void methodm1(){
			System.out.println("m1");
			
		}

	}
	class class2 extends class1{
		void methodm1(){
			System.out.println("m2");
			
		}

	}
	public class OverridingInNonstatic {
	public static void main(String[] args) {
		class2 m = new class2();
		m.methodm1();
	
		
	}

}
