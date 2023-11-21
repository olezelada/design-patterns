package javaexercices.solid.liskovsubstitution.bad;

import javaexercices.solid.liskovsubstitution.Car;

public class CarDrive {

    private static final String GAS = "gas";
    private static final String ELECTRIC = "electric";

    public static void main(String[] args){

        String carType = args[0];

        if(GAS.equals(carType)){
            Car car = new Car();
            car.accelerate();
        }else if (ELECTRIC.equals(carType)){
            ElectricCar electricCar = new ElectricCar();
            if(electricCar.hasBattery()){
                electricCar.accelerate();
            }
        }else {
            throw new RuntimeException("Invalid Car ...");
        }
    }
}
