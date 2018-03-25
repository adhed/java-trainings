package task10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubbleSortTest {

	@Test
	void shouldSortArrayOfNumbers() {
		BubbleSort bubbleSort = new BubbleSort();
		
		int[] myArray = { 1, 6, 5, 223, 3 };
		int[] expectedArray = { 1, 3, 5, 6, 223 };
		
		assertEquals(expectedArray, bubbleSort.sort(myArray));
	}

}
