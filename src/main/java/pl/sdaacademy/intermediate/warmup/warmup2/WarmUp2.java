package pl.sdaacademy.intermediate.warmup.warmup2;

public class WarmUp2 {
    public static void main(String[] args) {
        String[] array = new String[]{"abc", "cde", "efghijk", "lmnopr", "st", "u", "vwxyz"};

        System.out.println(findTotalLenght(array));
    }

    public static int findTotalLenght(String[] array) {
        int sum = 0;
        for (String s : array) {
            sum += s.length();
        }
        return sum;
    }
}
