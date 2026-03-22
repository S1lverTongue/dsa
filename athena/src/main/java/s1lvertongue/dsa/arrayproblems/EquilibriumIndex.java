package s1lvertongue.dsa.arrayproblems;

import java.util.Arrays;

public class EquilibriumIndex {
	
	/**
	 * Given an array arr[] of size n, find an equilibrium index
	 * (if any) or -1 if no equilibrium index exists. The equilibrium
	 * index of an array is an index such such that the sum or all elements
	 * at lower indexes equals the sum of all elements at higher indexes.
	 * When the index is at the start of the array, the left sum is 0,
	 * and when it's at the end, the right sum is 0.
	 * 
	 * @param arr
	 * @return
	 */
	public static int equilibriumIndex(int[] arr) {
		int total = Arrays.stream(arr).sum();
		
		int leftSum = 0;
		for (int i = 1; i < arr.length; i++) {
			leftSum += arr[i - 1];
			int rightSum = total - leftSum - arr[i];
			
			if (leftSum == rightSum) {
				return i;
			}
		}
		
		return -1;
	}

}
