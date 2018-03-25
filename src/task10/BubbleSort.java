package task10;

public class BubbleSort {
	int[] sort(int[] array) {
		int[] newArray = array.clone();
		int arrayLength = newArray.length;
		
        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = 0; j < arrayLength - i - 1; j++) {
                if (newArray[j] > newArray[j+1]) {
                	int temporary = newArray[j];
                	newArray[j] = newArray[j+1];
                	newArray[j+1] = temporary;
                    }
                }       
        }
        return newArray;
	}
}
