package javaexercices.solid.openclose.good;

public class RaceCar extends Car {

    @Override
    public void accelerate(){
        this.injectExtraGas();
        super.accelerate();
    }

    private void injectExtraGas(){
        // logic the injection extra gas
    }
}
