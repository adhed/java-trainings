package task10;

public class BubbleSort {
	int[] sort(int[] array) {
		int arrayLength = array.length;
		
        for (int i = 0; i <= arrayLength; i++) {
            for (int j = 0; j <= arrayLength - i; j++) {
                if (array[j] > array[j+1]) {
                	int temporary = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temporary;
                    }
                }       
        }
        return array;
	}
}
