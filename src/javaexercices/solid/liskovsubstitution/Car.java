package javaexercices.solid.liskovsubstitution;

public class Car implements ICar {
    @Override
    public void accelerate() {
        System.out.println("Accelerating the car ...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the car ...");
    }
}
