package Assignment3;

import java.util.Scanner;

public class ExceptionArithmetic {

	public static void main(String[] args) {
		// 6. Write a program where a method declares that it throws
		// ArithmeticException.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number dividend : ");
		int num1 = scanner.nextInt();
		System.out.println("Enter number divisor : ");
		int num2 = scanner.nextInt();
		scanner.close();
		try {
			int result = div(num1, num2);
			System.out.println("Result is : " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static int div(Integer dividend, Integer divisor) {

		if (divisor == 0) {
			throw new ArithmeticException("the divisor number should not equal zero");
		} else {
			System.out.println("Both parameters are correct!!");
		}
		return dividend / divisor;
	}

}
