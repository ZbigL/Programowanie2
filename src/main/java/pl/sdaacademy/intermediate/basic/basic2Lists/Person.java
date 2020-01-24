package pl.sdaacademy.intermediate.basic.basic2Lists;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
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
