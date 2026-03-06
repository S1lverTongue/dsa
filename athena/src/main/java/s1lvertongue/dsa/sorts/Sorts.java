package s1lvertongue.dsa.sorts;

public class Sorts {
	
	/**
	 * Function for sorting an array using the
	 * selection sort methodology.
	 * 
	 * @param values
	 */
	public static void selectionSort(int[] values) {
		for (int i = 0; i < values.length; i++) {
			
			int smallIndex = i;
			
			for (int j = i; j < values.length; j++) {
				if (values[j] < values[smallIndex]) {
					smallIndex = j;
				}
			}
			int temp = values[i];
			values[i] = values[smallIndex];
			values[smallIndex] = temp;
		}
	}
	
	/**
	 * Function for sorting an array using the insertion
	 * sort methodology.
	 * 
	 * @param values
	 */
	public static void insertionSort(int[] values) {
		for (int i = 0; i < values.length; i++) {
			int currentInsertIndex = i;
			int currentValue = values[currentInsertIndex];
			for (int j = i - 1; j > -1; j--) {
				if (values[j] > currentValue) {
					currentInsertIndex = j;
				}
			}
			
			for (int q = i; q > currentInsertIndex; q--) {
				values[q] = values[q - 1]; 
			}
			values[currentInsertIndex] = currentValue;
		}
	}
	
	/**
	 * Function for sorting an array's values by using the
	 * bubble sort methodology.
	 * 
	 * @param values
	 */
	public static void bubbleSort(int[] values) {
		for (int i = 0; i < values.length; i++) {
			
			for (int j = 0; j < values.length - i - 1; j++) {
				if (values[j] > values[j + 1]) {
					int temp = values[j+1];
					values[j+1] = values[j];
					values[j] = temp;
				}
			}
			
		}
	}
	
	/**
	 * Function for sorting an array in conjuction with
	 * the quick sort methodology.
	 * 
	 * @param values
	 * @param low
	 * @param high
	 * @return The partition index
	 */
	static int partition(int[] values, int low, int high) {
		int pivot = values[high];
		
		int i = low - 1;
		
		for (int j = low; j <= high - 1; j++) {
			if (values[j] < pivot) {
				i++;
				int temp = values[i];
				values[i] = values[j];
				values[j] = temp;
			}
		}
		
		int temp = values[i + 1];
		values[i] = values[high];
		values[high] = temp;
		
		return i + 1;
	}
	
	/**
	 * Function for sorting an array using the quick sort methodology.
	 * 
	 * @param values
	 * @param lowIndex
	 * @param highIndex
	 */
	private static void quickSort(int[] values, int lowIndex, int highIndex) {
		if (lowIndex < highIndex) {
			int pi = partition(values, lowIndex, highIndex);
			
			quickSort(values, lowIndex, pi - 1);
			quickSort(values, pi + 1, highIndex);
		}
	}
	
	/**
	 * Function for sorting an array using the quick sort methodology.
	 * 
	 * @param values
	 */
	public static void quickSort(int[] values) {
		quickSort(values, 0, values.length - 1);
	}

}
