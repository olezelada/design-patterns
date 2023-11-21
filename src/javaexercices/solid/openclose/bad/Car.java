package javaexercices.solid.openclose.bad;

public class Car {

    public void accelerate(boolean isRaceCar){
        if(isRaceCar){
            this.injectExtraGas();
        }
        // logic to accelerate car
    }

    public void stop(){
        // logic to stop car
    }

    private void injectExtraGas() {
        // logic for injection extra gas
    }



    /*
    * TODO: it was the initial design for this class, but we have modified to include other car types in the same class.
    * */
   /* public void accelerate(){
        // logic to accelerate car
    }

    public void stop(){
        // logic to stop car
    }*/
}
