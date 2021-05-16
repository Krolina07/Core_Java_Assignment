package Assignment1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// Write a program to check whether the current year is leap year or not. Users
		// will enter a year value.
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a year:");
		int year = scan.nextInt();
		scan.close();
		if (year % 400 == 0) {
			System.out.println(year + " is leap year");
		} else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + " is leap year");
		} else {
			System.out.println(year + " isn't a leap year");
		}

	}

}
