package practise;

public class LongNumbers {
/*
 * What will be the output when you use a Long number with L and without L suffix
 */
	public static void main(String[] args) {
		long longNumberWithoutL=1000*60*60*24*365;
		long longNumberWithL=1000*60*60*24*365L;
		System.out.println(longNumberWithoutL);
		System.out.println(longNumberWithL);
	}
}
//1471228928 WithoutL
//31536000000 WithL 