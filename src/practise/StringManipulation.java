package practise;

//WAP for string manipulation
public class StringManipulation {
	public static void main(String[] args) {
		String str = "The rains have started here";
		String str1 = "The rains have started here";
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("s"));
		System.out.println(str.indexOf("s", 9));
		System.out.println(str.indexOf("have"));
		System.out.println(str.indexOf("hello"));
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.substring(0, 9));

		String s = "Hello World";
		System.out.println(s.trim());
		System.out.println(s.replace(" ", ""));

		String date = "01-01-2017";
		System.out.println(date.replaceAll("-", "/"));
		String test = "Hello_World_Test_Selenium";
		String testVal[] = test.split("_");
		for (int i = 0; i < testVal.length; i++) {
			System.out.println(testVal[i]);
		}
		String s2 = "care";
		System.out.println(s2.concat("s"));
		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;
		System.out.println(x + y);
		System.out.println(x + y + a + b);
		System.out.println(a + b + x + y);
	}
}
