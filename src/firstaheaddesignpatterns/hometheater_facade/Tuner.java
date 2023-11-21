package firstaheaddesignpatterns.hometheater_facade;

public class Tuner {

    Amplifier amplifier;

    public void on(){
        System.out.println("ON was executed on Tuner");
    }

    public void off(){
        System.out.println("OFF was executed on Tuner");
    }

    public void setAm(){
        System.out.println("SET_AM was executed on Tuner");
    }

    public void setFm(){
        System.out.println("SET_FM was executed on Tuner");
    }

    public void setFrequency(){
        System.out.println("SET_FREQUENCY was executed on Tuner");
    }
}
