package sortowanie;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]arrayToSort = {3,12,12,18,2,8,1,5,12,432,321,343};
//        BubbleSort.bubbleSort(arrayToSort);
//        System.out.println(Arrays.toString(arrayToSort));

//        SelectionSort.selectionSort((arrayToSort));
//        System.out.println(Arrays.toString(arrayToSort));

        InsertionSort.insertionSort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));
    }
}
