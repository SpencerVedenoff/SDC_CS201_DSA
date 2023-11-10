

public class BubbleSort {

	void bubbleSort(String inputArray[][]) {
		
		// Variables
		String paper, paper2;
		int n = inputArray.length;
		
		// First loop is to traverse through all 50 states
		for (int i = 0; i < n-1; i++) {
			// Second loop performs comparison between two adjacent array elements and swap if needed
			for (int j = 0; j < n-i-1; j++) {
				// This compares both elements to determine if they are in natural order
				if (inputArray[j][1].compareTo(inputArray[j+1][1]) > 0) {
					// This step performs the swap between elements j and j+1
					// The scratchpad variables are used as temporary placeholders while swapping
					paper = inputArray[j][0];
					paper2 = inputArray[j][1];
					inputArray[j][0] = inputArray[j+1][0];
					inputArray[j][1] = inputArray[j+1][1];
					inputArray[j+1][0] = paper;
					inputArray[j+1][1] = paper2;
				}
			}
		}
	}
}