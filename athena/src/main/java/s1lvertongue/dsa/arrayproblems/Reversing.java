package s1lvertongue.dsa.arrayproblems;

public class Reversing {
	
	public static void reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while (start < end) {
			int temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			start++;
			end--;
		}
	}

}
