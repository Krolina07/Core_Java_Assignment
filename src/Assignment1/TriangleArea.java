package Assignment1;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		// Write a program to calculate the area of a triangle. Users will enter the
		// values for base and height of the triangle.
		double area;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter base:");
		double base = scan.nextInt();
		System.out.print("Enter height:");
		double height = scan.nextInt();
		scan.close();
		area = (base * height) / 2;
		System.out.println("The area is:" + area);
	}

}
