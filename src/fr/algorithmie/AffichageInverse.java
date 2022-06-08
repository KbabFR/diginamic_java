package fr.algorithmie;

public class AffichageInverse {

	/*
	 * Main method of AffichageInverse
	 */
	public static void main(String[] args) {
		// Array of int given in the TP
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		// Print all int in array
		System.out.print("Here is all the value of array : ");
		for(int i = 0; i < array.length -1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[array.length -1]);
		
		// Print all int in array BUT IN REVERSE!
		System.out.print("Here is all the value of array reversed : ");
		for(int i = array.length -1; i > 0; i--) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[0]);
		
		// Create a copy of array
		int[] arrayCopy = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			arrayCopy[i] = array[i];
		}

	}

}
