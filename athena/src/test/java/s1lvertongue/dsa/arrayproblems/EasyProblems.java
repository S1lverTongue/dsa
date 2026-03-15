package s1lvertongue.dsa.arrayproblems;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class EasyProblems {
	
	@Test
	public void duplicateWithinKDistanceTest() {
		int[] inputArr = {1,2,3,4,1,2,3,4};
		int k = 3;
		
		boolean result = DuplicateWithinKDistance.duplicateWithinKDistance(k, inputArr);
		
		assertFalse(result);
	}
	
	@Test
	public void duplicateWithinKDistanceTest2() {
		int[] inputArr = {1,2,3,1,4,5};
		int k = 4;
		
		boolean result = DuplicateWithinKDistance.duplicateWithinKDistance(k, inputArr);
		
		assertTrue(result);
	}
	
	@Test
	public void duplicateWithinKDistanceHashMapTest() {
		int[] inputArr = {1,2,3,4,1,2,3,4};
		int k = 3;
		
		boolean result = DuplicateWithinKDistance.duplicateWithinKDistanceHashMapSolution(k, inputArr);
		
		assertFalse(result);
	}
	
	@Test
	public void duplicateWithinKDistanceHashMapTest2() {
		int [] inputArr = {1,2,3,1,4,5};
		int k = 4;
		
		boolean result = DuplicateWithinKDistance.duplicateWithinKDistanceHashMapSolution(k, inputArr);
		
		assertTrue(result);
	}
	
	@Test
	public void evenGreaterThanOddTest() {
		int[] inputArr = {1,2,2,1};
		int[] correctArry = {1,2,1,2};
		
		EvenGreaterThanOdd.evenGreaterThanOdd(inputArr);
		
		assertTrue(Arrays.equals(inputArr, correctArry));
	}
	
	@Test
	public void evenGreaterThanOddTest2() {
		int[] inputArr = {1,3,2};
		int[] correctArray = {1,3,2};
		
		EvenGreaterThanOdd.evenGreaterThanOdd(inputArr);
		
		assertTrue(Arrays.equals(inputArr, correctArray));
	}
	
	@Test
	public void sumAllSubarraysTest() {
		int[] inputArr = {1,4,5,3,2};
		int result = 116;
		
		int output = SumAllSubarrays.sumAllSubarrays(inputArr);
		
		assertTrue(output == result);
	}
	
	@Test
	public void buyAndSellTest() {
		int[] prices = {100,180,260, 310, 40, 535, 695};
		int result = 865;
		
		int output = StockBuyAndSell.buyAndSell(prices);
		
		assertTrue(output == result);
	}
	
	@Test
	public void buyAndSellTest2() {
		int[] prices = {4,2};
		int result = 0;
		
		int output = StockBuyAndSell.buyAndSell(prices);
		
		assertTrue(output == result);
	}
	
	@Test
	public void uniqueNumbersTest() {
		int[] arr = {2,3,5,4,5,3,4};
		int result = 2;
		
		int output = UniqueNumbers1.uniqueNumbers(arr);
		
		assertTrue(output == result);
	}
	
	@Test
	public void missingNumberTest() {
		int[] arr = {8,2,4,5,3,7,1};
		int result = 6;
		
		int output = MissingNumber.missingNumber(arr);
		
		assertTrue(output == result);
	}
	
	@Test
	public void missingAndRepeatingTest() {
		int[] arr = {3,1,3};
		int[] correct = {3,2};
		
		int[] output = MissingAndRepeating.missingAndRepeating(arr);
		
		assertTrue(Arrays.equals(output, correct));
	}
	
	@Test
	public void repeatingNumbers() {
		int[] arr = {1,3,2,3,4};
		int correct = 3;
		
		
		int output = RepeatingNumbers.repeatingNumbers(arr);
		
		assertTrue(correct == output);
	}
	
	@Test
	public void repeatingNumbers2() {
		int[] arr = {1,5,1,2,3,4};
		int correct = 1;
		
		int output = RepeatingNumbers.repeatingNumbers(arr);
		
		assertTrue(correct == output);
	}
	
	@Test
	public void sorted3SubsequenceTest() {
		int[] arr = {12, 11, 10, 5, 6,2, 30};
		int[] correct = {5,6,30};
		
		int[] output = Sorted3Subsequence.sorted3Subsequence(arr);
		
		assertTrue(Arrays.equals(output, correct));
	}
	
	@Test
	public void sorted3SubsequenceTest2() {
		int[] arr = {4,3,2,1};
		int[] correct = {};
		
		int[] output = Sorted3Subsequence.sorted3Subsequence(arr);
		
		assertTrue(Arrays.equals(correct, output));
	}

}
