package pl.sdaacademy.intermediate.basic.basic1Arrays;

import java.util.Random;

public class ArrayBuilder {
    public static int[] initXYZArrayInt(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;

    }

    public static int[] initXYZArrayFibonacci(int size) {
        int[] array = new int[size];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < size; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    public static int[] initXYZArrayRandomInt(int minValue, int maxValue, int size) {
        int[] array = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = r.nextInt((maxValue + 1 - minValue) + minValue);
        }
        return array;
    }
}
