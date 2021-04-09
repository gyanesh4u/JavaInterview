package practise;

public class DivideByZero {
//What will be the output when you divide a number by zero
	// Number=Integer,Double,Float
	public static void main(String[] args) {
		System.out.println(9.0 / 0);
		System.out.println(12.33f / 0);
		System.out.println(10 / 0.0);
		System.out.println(19.9999d / 0);
		System.out.println(0.0 / 0);
		System.out.println(0.0 / 0.0);
		System.out.println(12.33 / 0.0);
	}
}
/*
 * Infinity 
 * Infinity 
 * Infinity 
 * Infinity 
 * NaN 
 * NaN 
 * Infinity
 */