package fr.algorithmie;

public class InversionContenu {
	
	/* Main method of InversionContenu
	 * We copy an array in revert
	 */
	public static void main(String[] args) {
		
		// Array of int given in the TP
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		// Create a copy of array but reversed
		int[] arrayCopy = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			arrayCopy[i] = array[array.length - (i + 1)];
		}
		
		// Print all int in array
		System.out.print("Here is all the value of array : ");
		for(int i = 0; i < array.length -1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[array.length -1]);
		
		// Print all int in arrayCopy
		System.out.print("Here is all the value of arrayCopy : ");
		for(int i = 0; i < arrayCopy.length -1; i++) {
			System.out.print(arrayCopy[i] + ", ");
		}
		System.out.println(arrayCopy[arrayCopy.length -1]);

	}

}
