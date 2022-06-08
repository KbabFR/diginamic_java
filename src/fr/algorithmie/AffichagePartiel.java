package fr.algorithmie;

public class AffichagePartiel {

	/* Main method of AffichagePartiel
	 * We partially print the value of array
	 */
	public static void main(String[] args) {

		// Array of int given in the TP
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

		// Print all int in array above 3
		System.out.print("Here is all the value of array above 3 : ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 3)
				System.out.print(array[i] + " ");
		}
		System.out.println();
		
		// Print all int in array pairs
		System.out.print("Here is all the value of array which are pairs : ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0)
				System.out.print(array[i] + " ");
		}
		System.out.println();
		
		// Print all int in array which index are pairs
		System.out.print("Here is all the value of array which index are pairs : ");
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0)
				System.out.print(array[i] + " ");
		}
		System.out.println();
		
		// Print all int in array odds
		System.out.print("Here is all the value of array which are odds : ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0)
				System.out.print(array[i] + " ");
		}
		System.out.println();

	}

}
