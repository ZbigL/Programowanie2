package pl.sdaacademy.intermediate.basic.basic1Arrays;

public class BubbleSort {
    public static int[] bubbleSortArray(int[] array) {
        boolean sort;
        do {
            sort = true;
            for (int i = 0; i < array.length - 1; i++) {
                int temp;
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sort = false;
                }
            }
        } while (!sort);
        return array;
    }
}
