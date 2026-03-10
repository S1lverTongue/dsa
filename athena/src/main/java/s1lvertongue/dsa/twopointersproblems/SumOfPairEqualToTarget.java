package s1lvertongue.dsa.twopointersproblems;

public class SumOfPairEqualToTarget {
	
	/**
	 * Given a sorted array arr (sorted in ascending order)
	 * and a target, find if there exists any pair of elements
	 * (arr[i], arr[j]) such that their sum is equal to the target.
	 * @param arr
	 * @param target
	 * @return
	 */
	public static boolean sumOfPairsEqualToTarget(int[] arr, int target) {
		int i = 0;
		int j = arr.length - 1;
		
		while (i < j) {
			if (arr[i] + arr[j] == target) {
				return true;
			}
			
			if (arr[i] + arr[j] > target) {
				j--;
			} else if (arr[i] + arr[j] < target) {
				i++;
			}
		}
		
		return false;
	}
}
