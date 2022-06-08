package fr.algorithmie;

public class SommeDeTableaux {

	/* Main method of SommeDeTableaux
	 * We add two array
	 */
	public static void main(String[] args) {

		// Array of int given in the TP
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
		
		// Sum of array1 and array2
		int[] arraySum = new int[array1.length];
		
		// Print the Sum of the arrays
		System.out.print("Here is the sum of array1 and array2 : ");
		for (int i = 0; i < arraySum.length -1; i++) {
			arraySum[i] = array1[i] + array2[i];
			System.out.print(arraySum[i] + ", ");
		}
		arraySum[array1.length -1] = array1[array1.length -1] + array2[array1.length -1];
		System.out.println(arraySum[array1.length -1]);

	}

}
