package Assignment2;
public class ReverseNum {

	public static void main(String[] args) {
		// Reverse a number 123
			
		int arr[] = { 1, 2,3};
		System.out.println("Elements");
		for (int i = 0; i<=2; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Reverse the elements");
		for (int j = 2; j >= 0; j--) {
			System.out.println(arr[j]);
		}
	}

}
