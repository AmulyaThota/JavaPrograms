package PracticeSeleniumJava;

public class MaxNmFomArray {

	public static void main(String[] args) {
		
		int array[] = {97,25,58, 12,10,67,51,10} ;
		int temp;
		int size = array.length;
		for(int i=0;i<array.length;i++) {
			for(int j = i+1; j<array.length;j++) {
				if(array[i]>array[j]) {
					temp = array[i];
					array[i]=array[j];
					array[j] = temp;
					
				}
			}
			
		}
		System.out.println("the highest second number is"+array[size-1]);
		System.out.println("the highest second number is"+array[size-2]);
	}

}
