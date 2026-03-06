package s1lvertongue.dsa.arrayproblems;

import java.util.ArrayList;

public class RemoveDuplicates {
	
	/**
	 * Function for iterating over an array of integers
	 * and removing any duplicates from it.
	 * 
	 * @param arr The array to iterate over.
	 * @return A new array with no duplicates included.
	 */
	public static int[] removeDuplicates(int[] arr) {
		if (arr.length == 0) {
			return new int[] {};
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(arr[0]);
		
		for (int q = 1; q < arr.length; q++) {
			if (arr[q] != arr[q - 1]) {
				al.add(arr[q]);
			}
		}
		
		return al.stream().mapToInt(i -> i).toArray();
	}

}
