package pl.sdaacademy.intermediate.basic.basic2Lists;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Basic2Lists {
    public static void main(String[] args) {
        Person person = new Person("adam", "NOWAK", "LODZ", 15, 123456789);
        Person person2 = new Person("JAN", "Kowalski", "katowice", 94, 987654322);
        Person person3 = new Person("jacek", "zen", "LODZ", 19, 258147963);
        Person person4 = new Person("anna", "mad", "zgierz", 25, 654789654);
        Person person5 = new Person("joann", "lorens", "gDAńsk", 42, 789654123);

        List<Person> persons = new ArrayList<Person>();
        persons.add(person);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        showPersonsInformations(persons);
        System.out.println("11111111111111111111111111111111111111111111111111111");
        showPersonsOverTwenty(persons);
        System.out.println("22222222222222222222222222222222222222222222222222222222");
        showPersonsEvenTelephone(persons);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        showAgeSum(persons);
        System.out.println("-----------PERSONS2------------------");

        List<Person> persons2 = new LinkedList<Person>(persons);
        persons2.remove(3);
        showAgeSum(persons2);
        countElemnts(persons);
        countElemnts(persons2);
    }

    public static void showPersonsInformations(List<Person> list) {
        for (Person p : list) {
            System.out.println(p);
        }
    }

    public static void showPersonsOverTwenty(List<Person> list) {
        for (Person p : list) {
            if (p.getAge() > 20) System.out.println(p);
        }
    }

    public static void showPersonsEvenTelephone(List<Person> list) {
        for (Person p : list) {
            if (p.getPhone() % 2 == 0) System.out.println(p);
        }
    }

    public static void showAgeSum(List<Person> list) {
        int sum = 0;
        for (Person p : list) {
            sum += p.getAge();
        }
        System.out.println("Suma wieku wszystkich osób : " + sum);
    }

    public static void countElemnts(List<Person> list) {
        int sum = 0;
        System.out.println("Ilość elementów w liście wynosi :" + list.size());

    }

}
