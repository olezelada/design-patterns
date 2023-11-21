package javaexercices.solid.liskovsubstitution.bad;

import javaexercices.solid.liskovsubstitution.ICar;

public class ElectricCar implements ICar {

    private static final int CHARGE_BATTERY = 95;
    private int battery;

    @Override
    public void accelerate() {
        System.out.println("Accelerating the car ...");;
    }

    @Override
    public void stop() {
        System.out.println("Stopping the car ...");;
    }

    public boolean hasBattery(){
        boolean hasEnergy;
        System.out.println("Checking battery ...");
        if(battery < CHARGE_BATTERY){
            System.out.println("The battery is very low :( ");
            hasEnergy = false;
        }else {
            System.out.println("Battery OK :) ");
            hasEnergy = true;
        }
        return hasEnergy;
    }
}
