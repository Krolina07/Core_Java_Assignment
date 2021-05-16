package Assignment4;

public class ReverseArraylist {
	//2. Reverse an Arraylist. 
	static int[] list;

	public static void main(String[] args) {

		int arr[] = {12, 32, 45, 65, 93, 6 };
		System.out.println("Array is {12, 32, 45, 65, 93, 6}");
		list = new int[arr.length];
		int count=arr.length;
		int k=count-1;
		System.out.println("==== Reverse an Arraylist ===");	
		for (int i = 0; i < count; i++) {
			list[k] = arr[i];
			k=k-1;
		}
		for (int j = 0; j < count; j++) {
			System.out.print(list[j]+", ");	
		}
	}
}