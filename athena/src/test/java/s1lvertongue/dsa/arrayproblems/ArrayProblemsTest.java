package s1lvertongue.dsa.arrayproblems;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;

import org.junit.Test;

import s1lvertongue.dsa.arrayproblems.AlternateElements;
import s1lvertongue.dsa.arrayproblems.GenerateAllSubarrays;
import s1lvertongue.dsa.arrayproblems.IsItSorted;
import s1lvertongue.dsa.arrayproblems.Leaders;
import s1lvertongue.dsa.arrayproblems.RemoveDuplicates;
import s1lvertongue.dsa.arrayproblems.Reversing;
import s1lvertongue.dsa.arrayproblems.Rotations;

public class ArrayProblemsTest {
	
	@Test
	public void alternateElementsTest() {
		int[] inputArray = {10, 20, 30, 40, 50};
		String correctRepresentation = "10 30 50";
		
		String representation = AlternateElements.alternateEleements(inputArray);
		
		assertTrue(representation.equals(correctRepresentation));
	}
	
	/**
	 * Given an array arr[] of size n, the task is to find all the leaders in
	 * the array. An element is a Leader if it is greater than or equal to
	 * all the elements to its right side.
	 * 
	 * Example:
	 * 	Input: arr[] = [16, 17, 4, 3, 5, 2]
	 * 	Output: [17, 5, 2]
	 *  Explanation: 17 is greater than all the elements to its right
	 *  i.e., [4,3,5,2], therefore 17 is a leader. 5 is greater than all
	 *  the elements to its right i.e., [2], therefore 5 is a leader. 2
	 *  has no elements to its right, therefore 2 is a leader.
	 */
	@Test
	public void arrayLeadersTest() {
		
		int[] inputArray = {16, 17, 4, 3, 5, 2};
		int[] outputArray = {17, 5, 2};
		
		int[] producedArray = Leaders.getLeaders(inputArray);
		
		assertTrue(Arrays.equals(outputArray, producedArray));
	
	}
	
	@Test
	public void arrayLeadersImprovedTest() {
		int[] inputArray = {16, 17, 4, 3, 5, 2};
		int[] outputArray = {17, 5, 2};
		
		int[] producedArray = Leaders.getLeadersImproved(inputArray);
		
		assertTrue(Arrays.equals(outputArray, producedArray));
	}
	
	@Test
	public void isItSortedTest() {
		int[] inputArray = {10, 20, 30, 40, 50};
		
		assertTrue(IsItSorted.isItSorted(inputArray));
	}
	
	@Test
	public void isItSortedFalseTest() {
		int[] inputArray = {90, 80, 100, 70, 40, 30};
		
		assertFalse(IsItSorted.isItSorted(inputArray));
	}
	
	@Test
	public void removeSortedDuplicatesTest() {
		int[] inputArray = {2,2,2,2,2};
		int[] outputArray = {2};
		
		int[] producedArray = RemoveDuplicates.removeDuplicates(inputArray);
		
		assertTrue(Arrays.equals(producedArray, outputArray));
	}
	
	@Test
	public void removeSortedDuplicatesTest2() {
		int[] arr = {1,2,2,3,4,4,4,5,5};
		int[] outputArray = {1,2,3,4,5};
		
		int[] producedArray = RemoveDuplicates.removeDuplicates(arr);
		
		assertTrue(Arrays.equals(producedArray, outputArray));	
	}
	
	@Test
	public void generateAllSubarraysTest() {
		int[] arr = {1,2,3};
		int[][] output = {{1}, {1,2}, {2}, {1,2,3}, {2,3}, {3}};
		
		int[][] producedArray = GenerateAllSubarrays.generateArray(arr);
		
		boolean allContained = true;
		for (int p = 0; p < producedArray.length; p++) {
			boolean inOutput = false;
			for (int j = 0; j < output.length; j++) {
				if (Arrays.equals(output[j], producedArray[p])) {
					inOutput = true;
				}
			}
			
			if (!inOutput) {
				allContained = false;
				break;
			}
		}
		assertTrue(allContained);
	}
	
	@Test
	public void reversingTest() {
		int[] inputArray = {1,4,3, 6, 2,6,5};
		int[] outputArray = {5,6,2, 6, 3,4,1};
		
		Reversing.reverseArray(inputArray);
		
		assertTrue(Arrays.equals(inputArray, outputArray));
	}
	
	@Test
	public void rightRotationsTest() {
		int[] inputArray = {1,2,3,4,5,6};
		int[] outputArray = {5,6,1,2,3,4};
		
		Rotations.rightRotation(inputArray, 2);
		
		assertTrue(Arrays.equals(inputArray, outputArray));
	}
	
	@Test
	public void leftRotationsTest() {
		int[] inputArray = {1,2,3,4,5,6};
		int[] outputArray = {3,4,5,6,1,2};
		
		Rotations.leftRotation(inputArray, 2);
		
		assertTrue(Arrays.equals(inputArray, outputArray));
	}
	
	@Test
	public void zerosEndTest() {
		int[] inputArray = {1, 2, 0, 4, 3, 0, 5, 0};
		int[] outputArray = {1, 2, 4, 3, 5, 0, 0, 0};
		
		ZerosEnd.zerosEnd(inputArray);
		
		assertTrue(Arrays.equals(inputArray, outputArray));
	}
	
	@Test
	public void minimumIncrementsTest() {
		int[] inputArray = {4,7,19,16};
		int k = 3;
		
		int output = MinimumIncrement.minimumIncrement(inputArray, k);
		
		assertTrue(output == 10);
	}
	
	@Test
	public void minimumIncrementsTest2() {
		int[] inputArr = {4,4,4,4};
		int k = 3;
		
		int output = MinimumIncrement.minimumIncrement(inputArr, k);
		
		assertTrue(output == 0);
	}
	
	@Test
	public void minimumIncrementsTest3() {
		int[] inputArr = {4,2,6,8};
		int k = 3;
		
		int output = MinimumIncrement.minimumIncrement(inputArr, k);
		
		assertTrue(output == -1);
	}

}
