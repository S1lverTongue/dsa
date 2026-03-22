package s1lvertongue.dsa.arrayproblems;

import java.util.Arrays;

public class MaxSubarraySum {
	
	static int sum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}
	
	public static int maxSubarraySum(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int[] q = Arrays.copyOfRange(arr, i, j + 1);
				if (sum(q) > maxSum) {
					maxSum = sum(q);
				}
			}
		}
		
		return maxSum;
	}

}
