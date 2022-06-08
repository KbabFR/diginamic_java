package fr.algorithmie;

public class RechercheMin {

	/* Main method of RechercheMin
	 * We find the smaller value in array
	 */
	public static void main(String[] args) {

		// Array of int given in the TP
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		// Print smaller int in array
		System.out.print("Here is the smaller value of array : ");
		int smol = array[0]; // store the smallest value but instantiate with the first value in the array
		for (int i = 1; i < array.length; i++) {
			if (array[i] < smol)
				smol = array[i];
		}
		System.out.println(smol);

	}
	
}
