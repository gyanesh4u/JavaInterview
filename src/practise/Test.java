package practise;

public class Test {
//static blic with final variable
	public static void main(String[] args) {
		System.out.println(Main.x);// it will take the value of Main.x=100 internally
	}
}

class Main {
	public static final int x = 100;
	static {
		System.out.println("main --class static block...");
	}
}
