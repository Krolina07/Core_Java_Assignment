package Assignment1;

public class PrimeNumbers {

	public static void main(String[] args) {
		// Write a program to print the first 10 prime numbers
		for (int i = 2; i <= 30; i++) {
			for (int j = 2; j <= i; j++) {
				if (j == i) {
					System.out.println(i);
				}
				if (i % j == 0) {
					break;
				}
			}
		}
	}

}
