package Assignment1;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// Write a program to reverse the elements of an array where the array size as
		// well as the array values are entered by the user.
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the array size:");
		int size = scan.nextInt();
		int[] arr = new int[size]; 
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the elements of the array");

		for (int i = 0; i < size; i++) {
			arr[size - i - 1] = reader.nextInt();
		}
		System.out.println("reverse the elements of an array");
		for (int j = 0; j < size; j++) {
			System.out.println(arr[j]);
		}

	}

}
