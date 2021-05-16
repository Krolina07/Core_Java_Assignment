package Assignment1;

import java.util.Scanner;

public class ArrayInAscendingOrder {

	public static void main(String[] args) {
		// Write a program to sort the elements of an array in ascending order.

		int array[] = { 2, 6, 11, 5, 4, 10, 7, 8 };
		int temp = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i] + " ");
		}
	}
}
