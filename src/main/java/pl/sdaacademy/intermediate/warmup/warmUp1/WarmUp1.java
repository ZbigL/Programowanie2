package pl.sdaacademy.intermediate.warmup.warmUp1;

public class WarmUp1 {
    public static void main(String[] args) {
        Person person = new Person("adam", "NOWAK", "LODZ", 15, 123456789);
        Person person2 = new Person("JAN", "Kowalski", "katowice", 94, 987654321);

        System.out.println(person);
        System.out.println(person2);
    }
}
