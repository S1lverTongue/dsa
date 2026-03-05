package s1lvertongue.dsa.sorts;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import s1lvertongue.dsa.sorts.Sorts;

public class SortsTest {
	
	@Test
	public void selectionSortTest() {
		int[] unsortedArray = new int[] {5, 4, 3, 2, 1 };
		int[] sortedArray = new int[] {1,2,3,4,5};
		
		Sorts.selectionSort(unsortedArray);
		
		boolean equalArrays = Arrays.equals(unsortedArray, sortedArray);
		
		assertTrue(equalArrays);
	}
	
	@Test
	public void insertionSortTest() {
		int[] unsortedArray = new int[] {3, 4, 5, 2, 1 };
		int[] sortedArray = new int[] {1,2,3,4,5};
		
		Sorts.insertionSort(unsortedArray);
		
		boolean equalArrays = Arrays.equals(unsortedArray, sortedArray);
		
		assertTrue(equalArrays);
	}
	
	@Test
	public void bubbleSortTest() {
		int[] unsortedArray = new int[] {3,4,5,1,2};
		int[] sortedArray = new int[] { 1,2,3,4,5};
		
		Sorts.bubbleSort(unsortedArray);
		
		boolean equalArrays = Arrays.equals(unsortedArray, sortedArray);
		
		assertTrue(equalArrays);
	}

}
