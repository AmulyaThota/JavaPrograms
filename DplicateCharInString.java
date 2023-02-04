package PracticeSeleniumJava;

public class DplicateCharInString {

	public static void main(String[] args) {
		String str = "Mynameisamulya";
		char array[] = str.toCharArray();
		int count;
		
		for(int i = 0; i<str.length(); i++) {
			 
			count = 1;
			for(int j = i+1;j<str.length();j++) {
				
				if(array[i]==array[j] && array[i]!=' ') {
					count++;
					array[j]=0;
				}
			}
			
			if(count>1&&array[i]!='0') {
				System.out.println(array[i]);
			}
			
			
		}
		

	}

}
