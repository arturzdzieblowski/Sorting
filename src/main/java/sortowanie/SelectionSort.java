package sortowanie;

public class SelectionSort {
    public static void selectionSort(int[] array) {


        for (int i = 0; i < array.length - 1; i++) {
            int minimum = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minimum]) {
                    minimum = j;
                }
            }
            int temp = array[minimum];
            array[minimum] = array[i];
            array[i] = temp;
        }
        }
    }
