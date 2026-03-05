package s1lvertongue.dsa.sorts;

public class Sorts {
	
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
	
	private static void quickSort(int[] values, int lowIndex, int highIndex) {
		if (lowIndex < highIndex) {
			int pi = partition(values, lowIndex, highIndex);
			
			quickSort(values, lowIndex, pi - 1);
			quickSort(values, pi + 1, highIndex);
		}
	}
	
	public static void quickSort(int[] values) {
		quickSort(values, 0, values.length - 1);
	}

}
