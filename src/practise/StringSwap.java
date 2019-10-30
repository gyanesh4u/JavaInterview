package practise;

//WAP to swap two string without using temp/third variable
public class StringSwap {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";
		System.out.println("Before swapping");
		System.out.println(a);
		System.out.println(b);

		// 1. append a and b
		a = a + b;
		// 2. store initial string in string b
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("the value of a and b after swapping");
		System.out.println(a);
		System.out.println(b);
	}
}
