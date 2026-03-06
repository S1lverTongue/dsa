package s1lvertongue.dsa.arrayproblems;

public class AlternateElements {
	
	/**
	 * Function for iterating over the different
	 * elements in an array and creating a string
	 * representation of the alternate elements in
	 * the array.
	 * 
	 * @param arr The array to interate over.
	 * @return A String representation of the alternate elements in the array.
	 */
	public static String alternateEleements(int[] arr) {
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < arr.length; i += 2) {
			b.append(arr[i]);
			b.append(" ");
		}
		return b.toString().trim();
	}
}
