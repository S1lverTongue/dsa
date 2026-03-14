package s1lvertongue.dsa.arrayproblems;

public class RepeatingNumbers {
	
	/**
	 * Given an array arr[] of size n filled with 1 to n - 1 in
	 * random order. The array has only one repetitive element. The
	 * task is to find the repetitive element.
	 * 
	 * @param arr
	 * @return
	 */
	public static int repeatingNumbers(int[] arr) {
		int s = 1;
		
		for (int i = 2; i < arr.length; i++) {
			s ^= i;
		}
		
		for (int i = 0; i < arr.length; i++) {
			s ^= arr[i];
		}
		
		return s;
	}

}
