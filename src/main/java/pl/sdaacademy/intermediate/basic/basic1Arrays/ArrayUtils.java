package pl.sdaacademy.intermediate.basic.basic1Arrays;

import java.util.Stack;

public class ArrayUtils {
    public static void showElementsDescending(int[] array) {
        Stack stack = new Stack();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        while (!stack.empty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
    }

    public static void showEvenElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void showSumEvenElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum += array[i];
            }
        }
    }
}
