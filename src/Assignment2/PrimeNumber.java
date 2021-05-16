package Assignment2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// Is 13 a prime number?
		Scanner scan = new Scanner(System.in);
		double num = 0, val = 0;
		boolean prime = false;
		System.out.print("Enter the number");
		num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				val++;
			}
		}
		if (val == 2) {
			prime = true;
			System.out.println("Is " + num + " a prime number? " + prime);
		} else {
			System.out.println("Is " + num + " a prime number? " + prime);
		}
	}

}
