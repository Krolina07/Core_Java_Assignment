package Assignment1;

public class Fibonacci {

	public static void main(String[] args) {
		// Write a program to print fibonacci series (10 values).

		int i = 0, num1 = 0, num2 = 1, temp;

		while (i < 10) {
			temp = num1;
			num1 = num2;
			num2 = temp + num1;
			i = i + 1;
			System.out.println(temp + "+" + num1 + "=" + num1);
		}

	}

}
