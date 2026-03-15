package s1lvertongue.dsa.arrayproblems;

public class Sorted3Subsequence {
	
	/**
	 * Given an array of n integers, find the 3
	 * elements such that a[i] < a[j] < a[k] and
	 * i < j < k. If there are multiple
	 * such triplets, then print any one of them.
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] sorted3Subsequence(int[] arr) {
		if (arr.length < 3) {
			return new int[] {};
		}
		
		int i = 0, j = 1, k = 2;
		
		while (i < arr.length - 2) {
			if (arr[i] < arr[j] && arr[j] < arr[k]) {
				return new int[] {arr[i], arr[j], arr[k]};
			}
			
			if (k != arr.length - 1) {
				k++;
				continue;
			}
			
			if (j != arr.length - 2) {
				j++;
				continue;
			}
			
			i++;
			j = i + 1;
			k = j + 1;
		}
		
		return new int[] {};
	}

}
