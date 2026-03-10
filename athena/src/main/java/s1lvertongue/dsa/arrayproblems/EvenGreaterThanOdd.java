package s1lvertongue.dsa.arrayproblems;

public class EvenGreaterThanOdd {
	
	/**
	 * Given an array arr[], sort the array according to the following relations:
	 * 
	 *  - arr[i] >= arr[i - 1], if i is even, 1 <= i < n
	 *  - arr[i] <= arr[i - 1], if i is odd, 1 <= i < n
	 *  
	 *  Consider 1-based indexing.
	 * @param arr
	 */
	public static void evenGreaterThanOdd(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (i % 2 != 0) { // even index
				if (arr[i] <= arr[i - 1]) {
					int temp = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = temp;
				}
			} else {
				if (arr[i] >= arr[i - 1]) {
					int temp = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

}
