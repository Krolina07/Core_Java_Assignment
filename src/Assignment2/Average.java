package Assignment2;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		//Java Program to Calculate average of numbers using Array 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the array size:");
		int size = scan.nextInt();
		int[] arr = new int[size]; 
		int sum =0, avg =0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the elements of the array");

		for (int i = 0; i < size; i++) {
			arr[i] = reader.nextInt();
			sum=sum+arr[i];
			
		}
		avg = sum/size;
		
		System.out.println("Average = " +avg);
	}

}
