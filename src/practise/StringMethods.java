package practise;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Sachin";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s);
		String s1 = "    Tendulkar   ";
		System.out.println(s1.trim());// remove junk spaces
		System.out.println(s.startsWith("Sa"));
		System.out.println(s.endsWith("n"));
		System.out.println(s.charAt(0));// index of the character in a string
		System.out.println(s.charAt(3));
		System.out.println(s.length());
		String s2 = new String("jimmy");
		String s3 = s2.intern();
		System.out.println(s3);
		String s4 = "Java is a programming language.Java is a platform.Java is an island";
		String replaceString = s4.replace("Java", "Kava");
		System.out.println(replaceString);

	}
}
