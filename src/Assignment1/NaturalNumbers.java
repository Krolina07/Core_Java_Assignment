package Assignment1;

public class NaturalNumbers {

	public static void main(String[] args) {
		// Write a program to print the sum of the first 20 natural numbers.
		int n = 20, result;
		result = (n * ++n) / 2;
		System.out.println("The sum of the first 20 natural numbers is:" + result);
	}

}
