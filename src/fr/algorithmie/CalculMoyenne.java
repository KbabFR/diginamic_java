package fr.algorithmie;

public class CalculMoyenne {

	/* Main method of CalculMoyenne
	 * We calculate the average of the array
	 */
	public static void main(String[] args) {

		// Array of int given in the TP
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		// Print the average of the array
		System.out.print("Here is the average of array : ");
		int average = array[0]; // store the sum of all the value but instantiate with the first value in the array
		for (int i = 1; i < array.length; i++) {
			average += array[i];
		}
		System.out.println(average / array.length + "." + ((average % array.length) * 10) / array.length);

	}

}
