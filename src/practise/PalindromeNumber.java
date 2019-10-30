package practise;
//WAP to find palindrome number

//reverse of the number is same eg:-151
public class PalindromeNumber {
	public static void isPalindromeNumber(int num) {
		int r = 0;
		int sum = 0;
		int t;
		t = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;

		}
		if (t == sum) {
			System.out.println("Palindrome number");
		} else {
			System.out.println("Not Palindrome number");
		}
	}

	public static void main(String[] args) {
		isPalindromeNumber(151);
		isPalindromeNumber(0);
		isPalindromeNumber(767);
		isPalindromeNumber(234);
	}
}
