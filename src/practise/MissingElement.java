package practise;

public class MissingElement {
	/**
	 * Find out the missing element in an integer array
	 * 
	 */
	public static void main(String[] args) {

		// 1 2 3 5 6.......1000
		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n1 = findMissingNumber(num, 10);
		System.out.println(n1);
	}

	public static int findMissingNumber(int num[], int totalCount) {

		int expSum = totalCount * (totalCount + 1) / 2;
		int actualSum = 0;
		for (int i : num) {
			actualSum += i;

		}
		return expSum - actualSum;
	}
}
