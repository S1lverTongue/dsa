package s1lvertongue.dsa.arrayproblems;

public class MinimumCostToOne {
	
	/**
	 * Given an array of n integers. We need to reduce size of array to one.
	 * We are allowed to select a pair of integers and remove the larger one of these
	 * two. This decreases the array size by 1. Cost of this operation
	 * is equal to value of smallest one. Find out minimum sum of costs of
	 * operations needed to convert the array into a single element.
	 * 
	 * @param arr
	 * @return
	 */
	public static int minimumCostToOne(int[] arr) {
		
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
		}
		
		return min * (arr.length - 1);
		
	}

}
