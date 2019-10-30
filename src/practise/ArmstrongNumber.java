package practise;

//WAP to find Armstrong number
//cube of sum of every digit =the number
//eg:-153=(1*1*1)+(5*5*5)+(3*3*3)=153
public class ArmstrongNumber {
	public static void isArmstrongNumber(int num) {
		System.out.println("given number is " + num);
		int cube = 0;
		int r;
		int t;
		t = num;
		while (num > 0) {
			r = num % 10;
			num = num / 10;
			cube = cube + (r * r * r);
		}
		if (t == cube) {
			System.out.println("This is an Armstrong Number");

		} else {
			System.out.println("This is not an Armstrong Number");
		}

	}

	public static void main(String[] args) {
		isArmstrongNumber(153);
		isArmstrongNumber(371);
		isArmstrongNumber(370);
		isArmstrongNumber(0);
		isArmstrongNumber(1);
		isArmstrongNumber(3);
	}
}
