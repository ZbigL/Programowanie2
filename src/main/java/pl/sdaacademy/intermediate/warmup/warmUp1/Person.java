package pl.sdaacademy.intermediate.warmup.warmUp1;

import java.time.LocalDateTime;

public class Person {
    private String name;
    private String surname;
    private String placeOfBirth;
    private int age;
    private long phone;

    public Person(String name, String surname, String placeOfBirth, int age, long phone) {
        this.name = name;
        this.surname = surname;
        this.placeOfBirth = placeOfBirth;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append(name.substring(0, 1).toUpperCase()).append(name.substring(1).toLowerCase()).
                append(" ").append(surname.substring(0, 1).toUpperCase()).append(surname.substring(1).toLowerCase()).
                append(" (ur. ").append(LocalDateTime.now().getYear() - age).append(" r.)").append("\n").append("m.ur.: ").
                append(placeOfBirth.substring(0, 1).toUpperCase()).append(placeOfBirth.substring(1).toLowerCase()).
                append("\n").append("tel: ").append(phone);

        return sb.toString();
    }


}
