package s1lvertongue.dsa.arrayproblems;

import java.util.BitSet;

public class MissingNumber {
	
	/**
	 * Given an array arr[] of size n - 1 with distinct integers
	 * in the range of [1,n]. This array represents a permutation of the 
	 * integers from 1 to n with one element missing. Find the missing element
	 * in the array.
	 * 
	 * @param arr
	 * @return
	 */
	public static int missingNumber(int[] arr) {
		BitSet bs = new BitSet(arr.length);
		bs.set(0);
		
		for (int i = 0; i < arr.length; i++) {
			bs.set(arr[i]);
		}
		
		return bs.nextClearBit(0);
	}
}
