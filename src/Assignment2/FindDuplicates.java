package Assignment2;

public class FindDuplicates {
	static int[] list;

	public static void main(String[] args) {
		// Find the duplicates in an array 12, 32, 12, 45, 65, 93, 0, 23, 45, 6
		int arr[] = { 12, 32, 12, 45, 65, 93, 0, 23, 45, 6 };
		System.out.println("Array is {12, 32, 12, 45, 65, 93, 0, 23, 45, 6}");
		list = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					if (number(arr[i])) {
						list[i] = arr[i];
					}
				}
			}
			if (list[i] != 0) {
				if (count>=2) {
					System.out.println("Number " + list[i] + " is duplicates ");	
				}
				
			}
		}
	}

	static boolean number(int num) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == num) {
				return false;
			}
		}
		return true;
	}
}
