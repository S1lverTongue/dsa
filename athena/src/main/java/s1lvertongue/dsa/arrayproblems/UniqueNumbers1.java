package s1lvertongue.dsa.arrayproblems;

public class UniqueNumbers1 {
	
	/**
	 * Given an array of integers, every element in the array
	 * appears twice except for one element which appears only once. The task
	 * is to identify and return the element that occurs only once.
	 * 
	 * @param arr
	 * @return
	 */
	public static int uniqueNumbers(int[] arr) {
		int res = 0;
		
		for (int i = 0; i < arr.length; i++) {
			res ^= arr[i];
		}
		
		return res;
	}

}
