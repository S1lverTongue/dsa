package s1lvertongue.dsa.arrayproblems;

public class SumAllSubarrays {
	
	/**
	 * Given an integer array arr[], compute the sum of all possible
	 * sub-arrays of the array. A sub-array is a contiguous part
	 * of the array.
	 * @param arr
	 * @return
	 */
	public static int sumAllSubarrays(int[] arr) {
		int result = 0;
		
		for (int i = 0; i < arr.length; i++) {
			result += (arr[i] * (i + 1) * (arr.length - i));
		}
		
		return result;
	}

}
