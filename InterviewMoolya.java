package PracticeSeleniumJava;

import org.openqa.selenium.Alert;

public class InterviewMoolya {

	public static void main(String[] args) {
		
	int	array[] = {34,11,54,10};
	
	int temp =0;
	int size = array.length;
	
	for(int i = 0; i<size;i++) {
		for(int j = i+1; j<size;j++) {
			if(array[i]>array[j]) {
				temp = array[i];
				array[i] = array[j];
				array[j]= temp;
				
			}
			
		}
	}
	System.out.println("the largest number is"+array[size-1]);
	System.out.println("the second largest number is"+array[size-2]);
		
	}


	

}
