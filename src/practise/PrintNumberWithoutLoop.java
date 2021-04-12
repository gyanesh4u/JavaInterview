package practise;

import java.util.stream.IntStream;

public class PrintNumberWithoutLoop {

	/*
	 * print 1 to 100 without using any loop recursive method
	 */
	public static void main(String[] args) {
		// printNum(1);
		//printNumber(1, 100);
		IntStream.range(1, 101).forEach(e -> System.out.println(e));//2. Java streams
	}

//1. recursive method
	public static void printNum(int num) {
		if (num <= 100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}

	public static void printNumber(int stNum, int endNum) {
		if (stNum <= endNum) {
			System.out.println(stNum);
			stNum++;
			printNumber(stNum, endNum);
		}
	}
}