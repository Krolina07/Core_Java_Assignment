package Assignment1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
// Write a program to calculate the factorial of a number using a while loop
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the factorial number:");
		int fact = scan.nextInt();
		int i = fact;
		do {
			i = i - 1;
			fact = fact * i;
		} while (i > 1);
		System.out.println("The factorial is: " + fact);
	}
}