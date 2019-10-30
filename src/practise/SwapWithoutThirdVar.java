package practise;

//WAP to swap two integers without using temp/third variable
public class SwapWithoutThirdVar {
	public static void main(String[] args) {
		int x = 5;
		int y = 10;

		// 1.with using third variable

		int t;
		t = x;
		x = y;
		y = t;
		System.out.println(x);
		System.out.println(y);

		// 2. without using third variable
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println(x);
		System.out.println(y);

		// 3
		x = x * y;
		y = x / y;
		x = x / y;
		System.out.println(x);
		System.out.println(y);

		// 4. Using XOR

		x = x ^ y;
		x = x ^ y;
		x = x ^ y;
		System.out.println(x);
		System.out.println(y);
	}
}
