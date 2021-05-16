package Assignment3;

import java.util.Scanner;

public class ExceptionFormat {

	/*
	 * Write a program to throw NumberFormatException and handle it appropriately
	 * with a proper message. If you pass invalid input to parseInt(str), this
	 * exception will be thrown
	 */

	public static void main(String args[]) {
		int valA;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value of A: ");
		try {
			valA = Integer.parseInt(scan.next());
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Number format exception occurred");
		}
	}
}
