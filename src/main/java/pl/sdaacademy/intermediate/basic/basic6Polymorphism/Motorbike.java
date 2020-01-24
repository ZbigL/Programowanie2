package pl.sdaacademy.intermediate.basic.basic6Polymorphism;

public class Motorbike implements Vehicle {
    private static final int MAX_SPEED = 300;
    private int speed = 0;


    @Override
    public void accelerate() {
        if (speed <= MAX_SPEED - 30) {
            speed += 30;
        } else System.out.println("Motor porusza się już z max. predkoscia  -" + MAX_SPEED);
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
