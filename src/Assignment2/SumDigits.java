package Assignment2;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		//  Find the sum of digits
		Scanner scan = new Scanner(System.in);
		int num = 0, sum=0;
		
		System.out.print("Type 5 digit");
		for (int i = 0; i < 5; i++) {
			num = scan.nextInt();
			sum = sum +num;
			}
		System.out.println("Sum result is" + sum);
	}

}
