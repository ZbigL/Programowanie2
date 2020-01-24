package pl.sdaacademy.intermediate.basic.basic6Polymorphism;

public class Rocket implements Vehicle {
    private static final int MAX_SPEED = Integer.MAX_VALUE;
    private static final int OFFSET = 1000;
    private int speed = 0;


    @Override
    public void accelerate() {
        if (speed + OFFSET <= MAX_SPEED) {
            speed += OFFSET;
        } else System.out.println("Rakieta porusza się już z max. predkoscia :" + MAX_SPEED);
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
