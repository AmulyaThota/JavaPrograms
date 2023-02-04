package PracticeSeleniumJava;

import java.util.HashMap;
import java.util.Map;

public class CountOfWordsInString {

	public static void main(String[] args) {
		String str = "I am Learning and New to New Automation Learning";
		String[] split = str.split(" ");
		Map<String,Integer>map = new HashMap<String,Integer>();
		int count =1;
		for(int i = 0;i<split.length;i++) {
			if(!map.containsKey(split[i])) {
				map.put(split[i], count);
			}else {
				map.put(split[i], map.get(split[i])+1);
			}
			}
		for(String x: map.keySet())
		System.out.println("the count of word" +x+ "="+map.get(x));

}

static void ReverseOfString() {
	String str= "Amulya Thota";
	String[] split = str.split(" ");
	String rev = "";
	{
	for (int i =split.length-1;i>=0;i--) {
		rev = rev + split[i];
	}
	System.out.println(rev);
}
}
}