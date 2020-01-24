package pl.sdaacademy.intermediate.basic.basic6Polymorphism;

public class Basic6Polymorphism {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Motorbike motorbike = new Motorbike();
        Rocket rocket = new Rocket();
        moveNTimesFast(bicycle, 5);
        System.out.println(bicycle.getSpeed());
        moveNTimesFast(motorbike, 3);
        System.out.println(motorbike.getSpeed());
        moveNTimesFast(bicycle, 7);
        System.out.println(bicycle.getSpeed());
        moveNTimesFast(rocket, 6);
        System.out.println(rocket.getSpeed());
        moveNTimesFast(motorbike, 30);
        System.out.println(motorbike.getSpeed());
    }

    public static int moveNTimesFast(Vehicle vehicle, int times) {
        for (int i = 1; i <= times; i++) {
            vehicle.accelerate();
        }
        return vehicle.getSpeed();

    }
}
