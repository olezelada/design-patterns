package javaexercices.solid.liskovsubstitution.good;

import javaexercices.solid.liskovsubstitution.ICar;
import javaexercices.solid.liskovsubstitution.Car;

public class CarDrive {

    private static final String GAS = "gas";
    private static final String ELECTRIC = "electric";

    public static void main(String[] args){
        ICar car;
        String carType = args[0];

        if(GAS.equals(carType)){
            car = new Car();
        }else if (ELECTRIC.equals(carType)){
            car = new ElectricCar();
        }else {
            throw new RuntimeException("Invalid Car ...");
        }
        car.accelerate();
    }
}
