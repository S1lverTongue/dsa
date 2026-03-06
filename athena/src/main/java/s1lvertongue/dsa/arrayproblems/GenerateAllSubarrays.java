package s1lvertongue.dsa.arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class GenerateAllSubarrays {
	
	/**
	 * Function for iterating over an array and then generating
	 * and collecting all of the different subarrays in the parent array.
	 * 
	 * @param arr The array to iterate over.
	 * @return int[][] two-dimensional array of the different subarrays.
	 */
	public static int[][] generateArray(int[] arr) {
		ArrayList<int[]> al = new ArrayList<>();
		
		for (int startingIndex = 0; startingIndex < arr.length; startingIndex++) {
			for (int endingIndex = startingIndex + 1; endingIndex < arr.length + 1; endingIndex++) {
				int[] subArray = Arrays.copyOfRange(arr, startingIndex, endingIndex);
				al.add(subArray);
			}
		}
		
		// Honestly surprised this is legal.
		int[][] ret = new int[al.size()][];
		
		for (int i = 0; i < al.size(); i++) {
			ret[i] = al.get(i);
		}
		
		return ret;
	}

}
