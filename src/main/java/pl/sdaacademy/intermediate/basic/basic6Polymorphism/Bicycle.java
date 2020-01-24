package pl.sdaacademy.intermediate.basic.basic6Polymorphism;

public class Bicycle implements Vehicle {

    private static final int MAX_SPEED = 50;
    private int speed = 0;


    @Override
    public void accelerate() {
        if (this.speed <= MAX_SPEED - 5) {
            this.speed += 5;
        } else System.out.println("Rower porusza się już z max. predkoscia :" + MAX_SPEED);
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
