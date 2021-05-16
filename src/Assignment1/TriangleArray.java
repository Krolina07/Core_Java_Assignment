package Assignment1;

public class TriangleArray {

	public static void main(String[] args) {
		// Write a program to print this output using a two-dimensional array.
		int[][] arr = new int[10][10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i+1; j++) {
				arr[i][j] = 0;
			}
		}
		for (int k = 0; k < 10; k++)
		{
			System.out.println("");
			for (int l = 0; l < k; l++)
			{
				System.out.print(arr[k][l]);
			}
		}
	}

}
