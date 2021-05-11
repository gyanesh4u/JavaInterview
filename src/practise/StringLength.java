package practise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * how to find length of string in java without using length method?
 */
public class StringLength {

	public static void main(String[] args) {
		String str="testing";
		System.out.println(str.toCharArray().length);
		
		System.out.println(str.lastIndexOf(""));
		
		Matcher m = Pattern.compile("$").matcher(str);
		m.find();
		int len = m.end();
		System.out.println(len);
		
		System.out.println(str.split("").length);
		{
		int l = new StringBuilder(str).length();
		System.out.println(l);
		
		int count=0;
		for(char c:str.toCharArray()) {
			count++;
		}
		System.out.println(count);
		System.out.println(getLength("testing"));
	}
	}
		public static int getLength(String str) {
			int i=0;
			try{
				
			
			while(true) {
				str.charAt(i);
				i++;
			}
		}
			catch(Exception e) {
				return i;
			}
	}
}