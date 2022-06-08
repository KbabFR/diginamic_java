package fr.algorithmie;

public class RechercheMax {

	/* Main method of RechercheMax
	 * We find the greater value in array
	 */
	public static void main(String[] args) {

		// Array of int given in the TP
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		// Print greater int in array
		System.out.print("Here is the greater value of array : ");
		int big = array[0]; // store the biggest value but instantiate with the first value in the array
		for (int i = 1; i < array.length; i++) {
			if (array[i] > big)
				big = array[i];
		}
		System.out.println(big);

	}

}
