package task10;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

	@Test
	void shouldSortArrayOfNumbers() {
		BubbleSort bubbleSort = new BubbleSort();
		
		int[] myArray = new int[]{ 1, 6, 5, 223, 3 };
		int[] expectedArray = new int[]{ 1, 3, 5, 6, 223 };
		
		Assert.assertArrayEquals(expectedArray, bubbleSort.sort(myArray));
	}
	
	@Test
	void shouldSortArrayOfNumbersGreaterThan100() {
		BubbleSort bubbleSort = new BubbleSort();
		
		int[] myArray = new int[]{ 100, 1000, 500, 200, 300 };
		int[] expectedArray = new int[]{ 100, 200, 300, 500, 1000 };
		
		Assert.assertArrayEquals(expectedArray, bubbleSort.sort(myArray));
	}

}
