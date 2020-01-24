package pl.sdaacademy.intermediate.basic.basic1Arrays;

import java.util.Arrays;

public class Basic1Arrays {
    public static void main(String[] args) {
        int[] ints = ArrayBuilder.initXYZArrayInt(10);
        int[] fibonacci = ArrayBuilder.initXYZArrayFibonacci(10);
        int[] randoms = ArrayBuilder.initXYZArrayRandomInt(10, 30, 10);

        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(fibonacci));
        System.out.println(Arrays.toString(randoms));
        System.out.println("\n----------------------------");

        ArrayUtils.showElementsDescending(ints);
        System.out.println("\n----------------------------");
        ArrayUtils.showElementsDescending(fibonacci);
        System.out.println("\n----------------------------");
        ArrayUtils.showElementsDescending(randoms);
        System.out.println("\n----------------------------");
        ArrayUtils.showEvenElements(ints);
        System.out.println("\n----------------------------");
        ArrayUtils.showEvenElements(fibonacci);
        System.out.println("\n----------------------------");
        ArrayUtils.showEvenElements(randoms);
        System.out.println("\n----------------------------");
        System.out.println(Arrays.toString(BubbleSort.bubbleSortArray(randoms)));


        System.out.println("\n----------------------------");
        System.out.println("\n----------------------------");
        System.out.println("\n----------------------------");


    }


}
