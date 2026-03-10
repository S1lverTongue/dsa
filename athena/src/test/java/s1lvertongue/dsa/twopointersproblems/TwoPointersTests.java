package s1lvertongue.dsa.twopointersproblems;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TwoPointersTests {
	
	@Test
	public void sumOfPairEqualToTargetTest() {
		int[] inputArr = {10,20,35, 50};
		int target = 70;
		
		boolean result = SumOfPairEqualToTarget.sumOfPairsEqualToTarget(inputArr, target);
		
		assertTrue(result);
	}
	
	@Test
	public void sumOfPairEqualToTargetTest2() {
		int[] inputArr = {10,20, 30};
		int target = 70;
		
		boolean result = SumOfPairEqualToTarget.sumOfPairsEqualToTarget(inputArr, target);
		
		assertFalse(result);
	}

}
