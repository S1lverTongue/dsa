package s1lvertongue.dsa.arrayproblems;

public class MinimumIncrement {
	
	private static int getMax(int[] arr) throws Exception {
		if (arr.length == 0) {
			throw new Exception("Empty array");
		}
		
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		return max;
	}
	
	/**
	 * You are given an array of n-elements, you have to find the number
	 * of operations needed to make all elements of array equal. Where a single
	 * operation can increment an element by k.
	 * If it is not possible to make all elements equal return -1.
	 * 
	 * @param arr
	 * @param k
	 * @return
	 */
	public static int minimumIncrement(int[] arr, int k) {
		int max = -1;
		try {
			max = getMax(arr);
		} catch (Exception e) {
			return -1;
		}
		
		int increments = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((max - arr[i]) % k == 0) {
				increments += (max - arr[i]) / k;
			} else {
				return -1;
			}
		}
		
		return increments;
	}

}
