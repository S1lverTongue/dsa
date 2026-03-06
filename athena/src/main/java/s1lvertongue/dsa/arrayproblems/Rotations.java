package s1lvertongue.dsa.arrayproblems;

public class Rotations {
	
	/**
	 * Function for rotating the array to the right.
	 * 
	 * @param arr The array to rotate.
	 * @param d The number of right rotations.
	 */
	public static void rightRotation(int[] arr, int d) {
		int end = arr[arr.length - 1];
		
		d = d % arr.length;
		while (d > 0) {
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = end;
			end = arr[arr.length - 1];
			d--;
		}
	}
	
	/**
	 * Function for rotating the array to the left.
	 * 
	 * @param arr The array to rotate.
	 * @param d The number of left rotations.
	 */
	public static void leftRotation(int[] arr, int d) {
		int start = arr[0];
		
		d = d % arr.length;
		while (d > 0) {
			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = start;
			start = arr[0];
			d--;
		}
	}

}
