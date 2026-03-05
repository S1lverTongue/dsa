package s1lvertongue.dsa.arrayproblems;

import java.util.ArrayList;

public class Leaders {
	
	/**
	 * Given an array inputArr[] of size n, the task is to find all Leaders in
	 * the array. An element is a Leader if it is greater than or equal to
	 * all the elements to its right side.
	 * 
	 * @param inputArr
	 * @return int[]
	 */
	public static int[] getLeaders(int[] inputArr) {
		ArrayList<Integer> al = new ArrayList<>();
		
		for (int i = 0; i < inputArr.length; i++) {
			boolean isALeader = true;
			for (int j = i; j < inputArr.length; j++) {
				if (inputArr[j] > inputArr[i]) {
					isALeader = false;
					break;
				}
			}
			if (isALeader) {
				al.add(inputArr[i]);
			}
		}
		
		return al.stream().mapToInt(i -> i).toArray();
	}
	
	public static int[] getLeadersImproved(int[] inputArr) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(inputArr[inputArr.length - 1]);
		int currentMax = inputArr[inputArr.length - 1];
		for (int i = inputArr.length - 1; i > 0; i--) {
			if (inputArr[i] > currentMax) {
				al.add(inputArr[i]);
				currentMax = inputArr[i];
			}
		}
		
		return al.reversed().stream().mapToInt(i -> i).toArray();
	}

}
