package s1lvertongue.dsa.arrayproblems;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

}
