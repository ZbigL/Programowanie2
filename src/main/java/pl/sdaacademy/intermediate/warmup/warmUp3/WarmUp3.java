package pl.sdaacademy.intermediate.warmup.warmUp3;

public class WarmUp3 {
    public static void main(String[] args) {
        int[] array = new int[]{-2, 3, 1, 23, -9, 0, 12, 6, -4};

        System.out.println(findMin(array));
        System.out.println(findMax(array));


    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < min) min = element;
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int element : array) {
            if (element > max) max = element;
        }
        return max;
    }
}
