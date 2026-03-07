package s1lvertongue.dsa.arrayproblems;

public class ZerosEnd {
	
	/**
	 * Bubbles all of the zeros to the
	 * end of the array.
	 * 
	 * @param arr
	 */
	public static void zerosEnd(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				
				count++;
			}
		}
	}

}
