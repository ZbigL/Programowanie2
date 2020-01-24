package pl.sdaacademy.intermediate.basic.basic4Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Basic4Sets {
    public static void main(String[] args) {

        Car vg = new Car("Volkswagen", "Golf", "1VWBH7A33DC118080");
        Car a3 = new Car("Audi", "A3", "1FTSW21R08EC46917");
        Car sleon = new Car("Seat", "Leon", "1FTFW1CF6EKF51253");
        Car a32 = new Car("Audi", "A3", "1FMFU17538LA84228");
        Car sI = new Car("Seat", "Ibiza", "1FTFW1CF6EKF51253");
        Car vP = new Car("Volkswagen", "Passat", "1VWBH7A33DC118080");

        Set<Car> cars = new HashSet<Car>();

        cars.add(vg);
        cars.add(a3);
        cars.add(sleon);
        cars.add(a32);
        cars.add(sI);
        cars.add(vP);

        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("LinkeHashMap");
        Set<Car> cars2 = new LinkedHashSet<Car>();

        cars2.add(vg);
        cars2.add(a3);
        cars2.add(sleon);
        cars2.add(a32);
        cars2.add(sI);
        cars2.add(vP);

        for (Car car : cars2) {
            System.out.println(car);
        }


    }


}
