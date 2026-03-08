package s1lvertongue.dsa.arrayproblems;

import java.util.HashMap;

public class DuplicateWithinKDistance {
	
	/**
	 * Given an integer array arr[] and an integer k, determine whether
	 * there exist two indices i and j such that arr[i] == arr[j] and |i - j|
	 * <= k. If such a pair exists, return 'Yes' (true), otherwise return 'No' (false).
	 * 
	 * @param k
	 * @param arr
	 * @return
	 */
	public static boolean duplicateWithinKDistance(int k, int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && j - i <= k) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean duplicateWithinKDistanceHashMapSolution(int k, int[] arr) {
		HashMap<Integer, Integer> mapping = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if (mapping.containsKey(arr[i])) {
				if (i - mapping.get(arr[i]) <= k) {
					return true;
				}
			} else {
				mapping.put(arr[i], i);
			}
		}
		return false;
	}

}
