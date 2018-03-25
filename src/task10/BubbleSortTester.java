package task10;

import java.util.Arrays;

import task10.BubbleSort;

public class BubbleSortTester {
	public static void main(String args[]) {
		BubbleSort bubbleSort = new BubbleSort();
		
		int[] myArray = new int[]{ 1, 35, 23, 2, 3, 4, 55, 6 };
		int[] sortedArray = bubbleSort.sort(myArray);
		
		System.out.println("My array before sorting:");
		System.out.println(Arrays.toString(myArray));
		System.out.println("My array after sorting:");
		System.out.println(Arrays.toString(sortedArray));
	}
}
