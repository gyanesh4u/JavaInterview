package practise;

//Write a program to reverse a string
public class ReverseString {

	public static void main(String[] args) {

		String s = "selenium";
		int len = s.length();// 8
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		System.out.println("the reverse of string is " + rev);
		// using string buffer
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}

}
