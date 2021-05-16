package Assignment3;

import java.util.Scanner;

public class NestedTryBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the divisor to divide 100 : ");
		try {
			int divisor = scanner.nextInt();
			scanner.close();
			int result = 100 / divisor;
			System.out.println("Arithmetic " + result);
		} catch (ArithmeticException e) {
			System.out.println("the divisor number should not equal zero");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("the divisor number should not equal string");
			e.printStackTrace();
		}
	}
}
