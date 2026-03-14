package s1lvertongue.dsa.arrayproblems;

public class MissingAndRepeating {
	
	/**
	 * Given an unsorted array arr[] of size n, containing
	 * elements from the range 1 to n, it is know that one
	 * number in this range is missing, and another number
	 * occurs twice in the array, find both the duplicate
	 * number and the missing number.
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] missingAndRepeating(int[] arr) {
		int value = 0;
		
		for (int i = 0; i < arr.length; i++) {
			value ^= arr[i];
			value ^= (i + 1);
		}
		
		int setBit = value & ~(value - 1);
		
		int x = 0, y = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if((arr[i] & setBit) != 0) {
				x ^= arr[i];
			} else {
				y ^= arr[i];
			}
			
			if (((i + 1) & setBit) != 0) {
				x ^= (i + 1);
			} else {
				y ^= (i + 1);
			}
		}
		
		int missing, repeating;
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				count++;
			}
		}
		
		if (count == 0) {
			missing = x;
			repeating = y;
		} else {
			missing = y;
			repeating = x;
		}
		
		return new int[] {repeating, missing};
		
	}

}
