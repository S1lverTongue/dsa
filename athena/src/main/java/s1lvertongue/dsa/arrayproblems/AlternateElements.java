package s1lvertongue.dsa.arrayproblems;

public class AlternateElements {
	
	public static String alternateEleements(int[] arr) {
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < arr.length; i += 2) {
			b.append(arr[i]);
			b.append(" ");
		}
		return b.toString().trim();
	}
}
